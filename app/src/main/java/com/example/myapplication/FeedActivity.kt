import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var feedAdapter: FeedAdapter? = null
    private var feedItems: MutableList<FeedItem>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Exemplo simples: preencha o feed com dados fictícios
        feedItems = ArrayList<FeedItem>()
        feedItems!!.add(FeedItem("Título 1", "Descrição 1", R.drawable.image1))
        feedItems!!.add(FeedItem("Título 2", "Descrição 2", R.drawable.image2))
        feedItems!!.add(FeedItem("Título 3", "Descrição 3", R.drawable.image3))
        feedAdapter = FeedAdapter(this, feedItems)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.setAdapter(feedAdapter)
    }
}