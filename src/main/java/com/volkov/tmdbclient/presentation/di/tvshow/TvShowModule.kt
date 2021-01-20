package com.volkov.tmdbclient.presentation.di.tvshow

import com.volkov.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.volkov.tmdbclient.domain.usecase.UpdateTvShowsUseCase
import com.volkov.tmdbclient.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}