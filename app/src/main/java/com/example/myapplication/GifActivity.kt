import android.R
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import javax.sql.DataSource

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
            .listener(object : RequestListener<GifDrawable?>() {
                fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<GifDrawable?>?,
                    isFirstResource: Boolean
                ): Boolean {
                    // Lidar com falha no carregamento do GIF (por exemplo, exibir uma imagem alternativa)
                    return false
                }

                fun onResourceReady(
                    resource: GifDrawable?,
                    model: Any?,
                    target: Target<GifDrawable?>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    // O GIF foi carregado com sucesso, você pode adicionar lógica adicional aqui, se necessário
                    return false
                }
            })
            .into(imageView) // ImageView onde você deseja exibir o GIF
    }
}