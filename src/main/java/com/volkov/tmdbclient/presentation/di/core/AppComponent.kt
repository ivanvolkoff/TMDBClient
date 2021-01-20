package com.volkov.tmdbclient.presentation.di.core

import com.volkov.tmdbclient.presentation.di.artist.ArtistSubComponent
import com.volkov.tmdbclient.presentation.di.movie.MovieSubComponent
import com.volkov.tmdbclient.presentation.di.tvshow.TvShowSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun movieSubComponent():MovieSubComponent.Factory
fun tvShowSubComponent():TvShowSubComponent.Factory
fun artistSubComponent():ArtistSubComponent.Factory

}