package com.volkov.tmdbclient.domain.usecase

import com.volkov.tmdbclient.data.model.artist.Artist
import com.volkov.tmdbclient.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}