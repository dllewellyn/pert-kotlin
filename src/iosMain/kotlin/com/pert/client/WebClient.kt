package com.pert.client

import io.ktor.client.HttpClient
import io.ktor.client.engine.ios.Ios

actual object WebClient {
    actual fun client() = HttpClient(Ios) {
    }
}