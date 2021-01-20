package com.volkov.tmdbclient.data.repository.movie.datasource

import com.volkov.tmdbclient.data.model.movie.Movie

interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}