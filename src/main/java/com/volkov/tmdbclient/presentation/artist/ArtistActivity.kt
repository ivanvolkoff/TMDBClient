package com.volkov.tmdbclient.presentation.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.volkov.tmdbclient.R
import com.volkov.tmdbclient.databinding.ActivityArtistBinding
import com.volkov.tmdbclient.presentation.di.Injector
import javax.inject.Inject

class ArtistActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: ArtistViewModelFactory
    private lateinit var artistViewModel: ArtistViewModel
    private lateinit var binding: ActivityArtistBinding
    private lateinit var adapter: ArtistAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_artist)
        (applicationContext as Injector).createArtistSubComponent()
            .inject(this)

        artistViewModel = ViewModelProvider(this,factory)
            .get(ArtistViewModel::class.java)
        initRecyclerView()

    }

    private fun initRecyclerView(){
        binding.artistRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ArtistAdapter()
        binding.artistRecyclerView.adapter = adapter
        displayPopularArtist()
    }
    private fun displayPopularArtist(){
        binding.artistProgressBar.visibility = View.VISIBLE
        val responceLiveData = artistViewModel.getArtists()
        responceLiveData.observe(this, Observer {
            if(it != null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.artistProgressBar.visibility = View.GONE
            }else{
                binding.artistProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available",Toast.LENGTH_SHORT).show()
            }
        })
    }
}