package com.example.testfragment.model

import android.graphics.drawable.Drawable

data class Console(
    var id: Long,
    var consoleName: String,
    var consoleImage: Drawable,
    var consoleDescription: String,
    var consoleMaker: String,
    var consoleReleaseDate: String
)