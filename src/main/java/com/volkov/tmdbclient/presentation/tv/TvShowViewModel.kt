package com.volkov.tmdbclient.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.volkov.tmdbclient.domain.usecase.GetTvShowsUseCase
import com.volkov.tmdbclient.domain.usecase.UpdateTvShowsUseCase

class TvShowViewModel(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel() {

 fun getTvShows() = liveData {
     val tvShowList = getTvShowsUseCase.execute()
     emit(tvShowList)
 }

 fun updateTvShows() = liveData {
     val tvShowList = updateTvShowsUseCase.execute()
     emit(tvShowList)
 }
}
