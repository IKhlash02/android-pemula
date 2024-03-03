package com.example.proyekakhirsederhana

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class University (
    val name: String,
    val detail: String,
    val photo : Int,
    val alamat: String,
    val telephone: String
        ): Parcelable