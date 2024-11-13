package com.example.moviescompose.user


fun genreLabel(genre: Genre): String = when (genre) {
    Genre.ADVENTURE -> "Aventure"
    Genre.ACTION -> "Action"
    Genre.COMEDY -> "Comedy"
    Genre.SF -> "Science-Fiction"
}

fun Genre.toLabel() : String {
    return when (this) {
        Genre.ADVENTURE -> "Aventure"
        Genre.ACTION -> "Action"
        Genre.COMEDY -> "Comedy"
        Genre.SF -> "Science-Fiction"
    }
}