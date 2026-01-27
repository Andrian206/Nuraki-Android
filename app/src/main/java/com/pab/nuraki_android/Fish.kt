package com.pab.nuraki_android
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fish(
    val name: String,
    val scientificName: String,
    val habitat: String,
    val description: String,
    val photo: Int
) : Parcelable