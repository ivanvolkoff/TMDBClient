package com.volkov.tmdbclient.presentation.di.artist

import com.volkov.tmdbclient.domain.usecase.GetArtistsUseCase
import com.volkov.tmdbclient.domain.usecase.UpdateArtistsUseCase
import com.volkov.tmdbclient.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}