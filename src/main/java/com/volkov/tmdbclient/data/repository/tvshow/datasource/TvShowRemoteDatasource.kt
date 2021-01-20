package com.volkov.tmdbclient.data.repository.tvshow.datasource

import com.volkov.tmdbclient.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}