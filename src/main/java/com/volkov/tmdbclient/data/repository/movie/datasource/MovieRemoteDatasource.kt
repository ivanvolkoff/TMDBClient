package com.volkov.tmdbclient.data.repository.movie.datasource

import com.volkov.tmdbclient.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}