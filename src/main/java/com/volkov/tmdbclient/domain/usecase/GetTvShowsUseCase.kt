package com.volkov.tmdbclient.domain.usecase

import com.volkov.tmdbclient.data.model.tvshow.TvShow
import com.volkov.tmdbclient.domain.repository.TvShowRepository

class GetTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}