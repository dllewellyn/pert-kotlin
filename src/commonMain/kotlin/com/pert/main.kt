package com.pert

import com.pert.client.WebClient
import com.pert.client.retriever.Settings
import com.pert.client.retriever.StageRetriever
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.*

fun main() {
    val settings = Settings("http://localhost:8080/data")

    val scope = GlobalScope.launch {
        with(StageRetriever(WebClient.client(), settings)) {
            print(retrieveLatest())
        }
    }

    while (scope.isActive) {
    }
}