package com.volkov.tmdbclient.data.repository.artist.datasource

import com.volkov.tmdbclient.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}