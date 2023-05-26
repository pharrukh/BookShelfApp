package com.normuradov.bookshelfapp.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

data class GoogleBooksResponse(
    val items: List<GoogleBook>
)

@Serializable
data class GoogleBook(
    val id: String,
    val volumeInfo: VolumeInfo,
)

@Serializable
data class VolumeInfo(
    val imageLinks: ImageLinks
)

@Serializable
data class ImageLinks(
    val thumbnail: String
)