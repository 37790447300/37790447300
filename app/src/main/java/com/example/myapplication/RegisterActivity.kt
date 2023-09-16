import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    private var editTextName: EditText? = null
    private var editTextEmail: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonRegister: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        editTextName = findViewById<EditText>(R.id.editTextName)
        editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        buttonRegister = findViewById<Button>(R.id.buttonRegister)
        buttonRegister.setOnClickListener(View.OnClickListener { // Adicione a lógica de registro de usuário aqui
            val name = editTextName.getText().toString()
            val email = editTextEmail.getText().toString()
            val password = editTextPassword.getText().toString()

            // Exemplo simples: redirecione para a tela de login após o registro
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        })
    }
}