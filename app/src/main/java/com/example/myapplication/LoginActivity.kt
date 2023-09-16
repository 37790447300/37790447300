import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private var editTextUsername: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonLogin: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        buttonLogin = findViewById<Button>(R.id.buttonLogin)
        buttonLogin.setOnClickListener(View.OnClickListener { // Adicione a lógica de autenticação aqui
            val username = editTextUsername.getText().toString()
            val password = editTextPassword.getText().toString()

            // Exemplo simples: redirecione para a tela de serviços após o login
            val intent = Intent(this@LoginActivity, ServicesActivity::class.java)
            startActivity(intent)
        })
    }
}