package com.volkov.tmdbclient.presentation.di.movie

import com.volkov.tmdbclient.domain.usecase.GetMoviesUseCase
import com.volkov.tmdbclient.domain.usecase.UpdateMoviesUsecase
import com.volkov.tmdbclient.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}