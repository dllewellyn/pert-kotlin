package com.pert.apimodels

import kotlinx.serialization.Serializable

@Serializable
data class Stage(val isQuestion: Boolean = false, val text: String)

@Serializable
data class TechniqueApi(
    val techniqueName: String = "",
    val image: String = "",
    val multiStages: List<Stage> = listOf(),
    val type: String = ""
)