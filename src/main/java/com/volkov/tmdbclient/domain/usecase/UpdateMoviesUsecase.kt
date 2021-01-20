package com.volkov.tmdbclient.domain.usecase

import com.volkov.tmdbclient.data.model.movie.Movie
import com.volkov.tmdbclient.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}