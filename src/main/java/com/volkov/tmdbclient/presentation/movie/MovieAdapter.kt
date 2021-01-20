package com.volkov.tmdbclient.presentation.movie

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.volkov.tmdbclient.R
import com.volkov.tmdbclient.data.model.movie.Movie
import com.volkov.tmdbclient.databinding.ListItemBinding

class MovieAdapter(): RecyclerView.Adapter<MyViewHolder>() {
    var movieList = ArrayList<Movie>()

    fun setList(movies: List<Movie>){
        movieList.clear()
        movieList.addAll(movies)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}
class MyViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(movie:Movie){
        binding.titleTextView.text = movie.title
        binding.descriptionTextView.text = movie.overview
        val posterIrl: String =  "https://image.tmdb.org/t/p/w500" + movie.posterPath
        Glide.with(binding.imageView.context).load(posterIrl).into(binding.imageView)
    }
}