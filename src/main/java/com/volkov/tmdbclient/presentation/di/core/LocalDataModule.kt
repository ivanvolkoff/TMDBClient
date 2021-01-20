package com.volkov.tmdbclient.presentation.di.core

import com.volkov.tmdbclient.data.db.ArtistDao
import com.volkov.tmdbclient.data.db.MovieDao
import com.volkov.tmdbclient.data.db.TvShowDao
import com.volkov.tmdbclient.data.repository.artist.datasource.ArtistLocalDataSource
import com.volkov.tmdbclient.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.volkov.tmdbclient.data.repository.movie.datasource.MovieLocalDataSource
import com.volkov.tmdbclient.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.volkov.tmdbclient.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.volkov.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}