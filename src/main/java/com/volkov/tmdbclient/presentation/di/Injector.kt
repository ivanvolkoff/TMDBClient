package com.volkov.tmdbclient.presentation.di

import com.volkov.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.volkov.tmdbclient.presentation.di.movie.MovieSubComponent
import com.volkov.tmdbclient.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent():MovieSubComponent
   fun createTvShowSubComponent():TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}