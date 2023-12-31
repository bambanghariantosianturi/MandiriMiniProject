package com.example.myandroidproject.detail.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myandroidproject.core.data.Resource
import com.example.myandroidproject.core.domain.model.detailmoviemodel.DetailMovie
import com.example.myandroidproject.core.domain.model.movietrailermodel.MovieTrailerItemModel
import com.example.myandroidproject.core.domain.usecase.DataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val dataUseCase: DataUseCase): ViewModel(),
    IDetailViewModel {

    override fun getDetailMovieData(movieId: Int): LiveData<Resource<DetailMovie>> {
        return dataUseCase.getDetailMovieData(movieId)
    }

    override fun getMovieTrailer(movieId: Int): LiveData<Resource<List<MovieTrailerItemModel>>> {
        return dataUseCase.getMovieTrailer(movieId)
    }
}