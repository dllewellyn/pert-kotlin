package com.pert.client

import io.ktor.client.HttpClient

expect object WebClient {
    fun client() : HttpClient
}