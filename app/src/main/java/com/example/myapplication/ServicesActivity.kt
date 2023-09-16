import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ServicesActivity : AppCompatActivity() {
    private var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)
        listView = findViewById<ListView>(R.id.listView)

        // Exemplo simples: preencha a lista com serviços fictícios
        val services = arrayOf("Serviço 1", "Serviço 2", "Serviço 3")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, services)
        listView.setAdapter(adapter)
    }
}