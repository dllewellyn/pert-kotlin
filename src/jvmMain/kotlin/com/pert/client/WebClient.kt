package com.pert.client

import io.ktor.client.HttpClient
import io.ktor.client.features.json.GsonSerializer
import io.ktor.client.features.json.JsonFeature

actual object WebClient {
    actual fun client() = HttpClient().config {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }
}