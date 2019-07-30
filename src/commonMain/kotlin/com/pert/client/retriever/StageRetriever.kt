package com.pert.client.retriever

import com.pert.models.StagedDetail
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import kotlinx.serialization.list

class Settings(val latestUrl : String) {

}

class StageRetriever(private val httpClient: HttpClient, private val settings: Settings) {

    suspend fun retrieveLatest() : List<StagedDetail> {
        return with (Json(JsonConfiguration.Default)) {
         parse(StagedDetail.serializer().list, httpClient.get(settings.latestUrl))
        }
    }
}