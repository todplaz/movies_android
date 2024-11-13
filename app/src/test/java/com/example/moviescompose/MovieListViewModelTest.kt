package com.example.moviescompose

import app.cash.turbine.test
import com.example.moviescompose.movie.MovieListUIState
import com.example.moviescompose.movie.MovieListViewModel
import com.example.moviescompose.user.sampleMovies
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MovieListViewModelTest {
    @Test
    fun `loadMovies produces success state`() = runTest {
        //ARRANGE
        val vm = MovieListViewModel()
        vm.uiStateFlow.test {
            //ACT
            vm.loadMovies()
            //ASSERT
            assertEquals(
                MovieListUIState.Success(sampleMovies),
                expectMostRecentItem()
            )
        }
    }
}