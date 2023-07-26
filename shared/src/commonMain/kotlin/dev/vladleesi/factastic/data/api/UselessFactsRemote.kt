package dev.vladleesi.factastic.data.api

import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

suspend fun getUselessFact(): HttpResponse =
    httpClient.get("/api/v2/facts/random")
