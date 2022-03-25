package com.moviles.practicarecyclerviewsimple

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moviles.practicarecyclerviewsimple.databinding.ItemPostBinding
import org.json.JSONObject

class MainAdapter(private val videos: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.render(videos[position])
    }

    //videos.size()
    override fun getItemCount(): Int  = videos.size

    class MainHolder(val binding: ItemPostBinding): RecyclerView.ViewHolder(binding.root){
        fun render(video: JSONObject){
            //TODO binding.tvVideoTitle.setText(video.getString("title")
            binding.tvVideoTitle.setText(video.getString("title"))
            binding.tvChannelName.setText(video.getString("channel"))
            binding.tvVideoViewCount.setText(video.getString("views"))
            binding.tvVideoDatePosted.setText(video.getString("posted"))
            binding.ivVideoThumbnail.setImageResource(R.drawable.video_thumbnail_placeholder)
            binding.ivAvatarThumbnail.setImageResource(R.drawable.avatar_placeholder)
        }
    }

}