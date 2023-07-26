package dev.vladleesi.factastic.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UselessFactsResponse(
    val id: String?,
    val language: String?,
    val permalink: String?,
    val source: String?,
    @SerialName("source_url")
    val sourceUrl: String?,
    val text: String?
)