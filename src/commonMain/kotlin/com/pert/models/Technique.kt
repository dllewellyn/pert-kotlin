package com.pert.models

import com.pert.apimodels.Stage
import kotlinx.serialization.Serializable

enum class Type(val s: String) {
    MULTI("multi"),
    STANDARD("basic");

    companion object {
        fun fromString(s: String) = when (s) {
            Type.MULTI.s -> Type.MULTI
            Type.STANDARD.s -> Type.STANDARD
            else -> throw IllegalArgumentException()
        }
    }
}

@Serializable
class Technique(
    val techniqueName: String,
    val image: String,
    val multiStages: List<Stage>,
    val type: Type
)