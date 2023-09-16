import android.R
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class GifActivity : AppCompatActivity() {
    private var imageView: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gif)
        imageView = findViewById<ImageView>(R.id.imageView)

        // URL do GIF que você deseja baixar e exibir
        val gifUrl = "https://www.example.com/seu_gif.gif"

        // Use o Glide para baixar e exibir o GIF
        Glide.with(this)
            .asGif() // Indica que você está carregando um GIF
            .load(gifUrl) // URL do GIF
            .into(imageView) // ImageView onde você deseja exibir o GIF
    }
}