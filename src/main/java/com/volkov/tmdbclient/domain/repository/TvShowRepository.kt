package com.volkov.tmdbclient.domain.repository

import com.volkov.tmdbclient.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}