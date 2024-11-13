package com.example.moviescompose.user

import com.example.moviescompose.R


enum class Genre {
    ADVENTURE,
    ACTION,
    COMEDY,
    SF,
}

data class Movie(
    val title: String,
    val genre: Genre,
    val releaseDate: String,
    val posterId: Int,
)

val sampleMovies = listOf(
    Movie("Gatos con botas", Genre.ADVENTURE, "2022", R.drawable.chatpote),
    Movie("Jungle", Genre.ADVENTURE, "2017", R.drawable.jungle),
    Movie("Kung Pow", Genre.COMEDY, "2022", R.drawable.kungpow),
    Movie("Pulpe Fiction", Genre.COMEDY, "1994", R.drawable.pulpfiction),
    Movie("Gatos con botas", Genre.ADVENTURE, "2022", R.drawable.chatpote),
    Movie("Jungle", Genre.ADVENTURE, "2017", R.drawable.jungle),
    Movie("Kung Pow", Genre.COMEDY, "2022", R.drawable.kungpow),
    Movie("Pulpe Fiction", Genre.COMEDY, "1994", R.drawable.pulpfiction),
    Movie("Gatos con botas", Genre.ADVENTURE, "2022", R.drawable.chatpote),
    Movie("Jungle", Genre.ADVENTURE, "2017", R.drawable.jungle),
    Movie("Kung Pow", Genre.COMEDY, "2022", R.drawable.kungpow),
    Movie("Pulpe Fiction", Genre.COMEDY, "1994", R.drawable.pulpfiction),
    Movie("Gatos con botas", Genre.ADVENTURE, "2022", R.drawable.chatpote),
    Movie("Jungle", Genre.ADVENTURE, "2017", R.drawable.jungle),
    Movie("Kung Pow", Genre.COMEDY, "2022", R.drawable.kungpow),
    Movie("Pulpe Fiction", Genre.COMEDY, "1994", R.drawable.pulpfiction),
    Movie("Gatos con botas", Genre.ADVENTURE, "2022", R.drawable.chatpote),
    Movie("Jungle", Genre.ADVENTURE, "2017", R.drawable.jungle),
    Movie("Kung Pow", Genre.COMEDY, "2022", R.drawable.kungpow),
    Movie("Pulpe Fiction", Genre.COMEDY, "1994", R.drawable.pulpfiction),
)
