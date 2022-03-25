package com.moviles.practicarecyclerviewsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.moviles.practicarecyclerviewsimple.databinding.ActivityMainBinding
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fakeVideoData: Array<JSONObject> = arrayOf(
            JSONObject("{\"title\": \"An example of a title\"," +
                            "\"channel\": \"Channel\"," +
                            "\"views\": \"567k\"," +
                            "\"posted\": \"5 days ago\"}"),
            JSONObject("{\"title\": \"An example of another\"," +
                    "\"channel\": \"Channel2\"," +
                    "\"views\": \"7k\"," +
                    "\"posted\": \"8 days ago\"}")
        )
        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}