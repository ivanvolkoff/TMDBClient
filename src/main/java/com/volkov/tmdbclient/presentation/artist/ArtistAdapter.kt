package com.volkov.tmdbclient.presentation.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.volkov.tmdbclient.R
import com.volkov.tmdbclient.data.model.artist.Artist
import com.volkov.tmdbclient.databinding.ListItemBinding

class ArtistAdapter(): RecyclerView.Adapter<MyViewHolder>()  {
    private val artistList = ArrayList<Artist>()
    fun setList (artist: List<Artist>){
        artistList.clear()
        artistList.addAll(artist)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.bind(artistList[position])
    }

    override fun getItemCount(): Int {
        return artistList.size
    }
}
class MyViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(artis: Artist){
        binding.titleTextView.text = artis.name
        binding.descriptionTextView.text = artis.popularity.toString()
        val posterUrl : String = "https://image.tmdb.org/t/p/w500" + artis.profilePath
        Glide.with(binding.imageView.context).load(posterUrl).into(binding.imageView)

    }
}