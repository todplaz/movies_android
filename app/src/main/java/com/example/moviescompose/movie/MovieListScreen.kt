package com.example.moviescompose.movie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.moviescompose.ui.theme.MoviesTheme
import com.example.moviescompose.user.Movie
import com.example.moviescompose.user.genreLabel
import com.example.moviescompose.user.sampleMovies


@Composable
fun MovieListScreen(vm: MovieListViewModel = viewModel()) {

    val movies by vm:moviesFlow.collectAsState()

    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            items(movies) { movie ->
                MovieItem(movie)
            }


        }
    }
}

@Composable
fun MovieBody(state: MovieListUIState) {
    when(state) {
        is MovieListUIState.Failure -> TODO()
        MovieListUIState.Loading -> TODO()
        is MovieListUIState.Success -> {
            LazyColumn {
                items(state.movies) {
                    movie -> MovieItem((movie))
                }
            }
        }
    }
}

@Composable
fun MovieItem(movie: Movie) {
    Row() {
        Image(
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape),
            painter = painterResource(id = movie.posterId),
            contentDescription = "Poster"
        )

        Column(verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)) {
            Text(movie.title, style = MaterialTheme.typography.bodyLarge)
            Text(movie.releaseDate, style = MaterialTheme.typography.bodySmall)
        }

        Spacer(Modifier.weight(1.0f))
        Text(genreLabel(movie.genre))
    }
}

@Preview
@Composable
fun PreviewMovieItem() {
    MoviesTheme {
        MovieItem(sampleMovies.first())
    }
}

@Preview
@Composable
fun PreviewMovieListScreen() {
    MoviesTheme {
        MovieListScreen()
    }
}