package com.volkov.tmdbclient.domain.usecase

import com.volkov.tmdbclient.data.model.movie.Movie
import com.volkov.tmdbclient.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
  suspend fun execute():List<Movie>? = movieRepository.getMovies()
}