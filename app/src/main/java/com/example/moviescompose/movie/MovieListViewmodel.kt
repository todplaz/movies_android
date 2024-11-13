package com.example.moviescompose.movie

import androidx.lifecycle.ViewModel
import com.example.moviescompose.user.Movie
import com.example.moviescompose.user.sampleMovies
import kotlinx.coroutines.flow.MutableStateFlow


sealed class  MovieListUIState {
    data object Loading : MovieListUIState()
    data class  Success(val movies: List<Movie>) : MovieListUIState()
    data class  Failure(val message: String) : MovieListUIState()
}
class MovieListViewModel : ViewModel() {

    val uiStateFlow = MutableStateFlow<MovieListUIState>(MovieListUIState.Loading)
    val moviesFlow = MutableStateFlow(listOf<Movie>())
    val errorFlow = MutableStateFlow((""))

            fun loadMovies() {
                uiStateFlow.value = MovieListUIState.loading
                moviesFlow.value = sampleMovies
            }
}