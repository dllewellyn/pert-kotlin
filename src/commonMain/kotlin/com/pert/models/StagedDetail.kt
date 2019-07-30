package com.pert.models

import kotlinx.serialization.Serializable

@Serializable
data class StagedDetail(val description: String = "" ,
                        val title: String = "",
                        val headerImage: String? = null,
                        val image: String,
                        val order: Int = 100,
                        val quote: String,
                        val voice: String,
                        val speech : String,
                        val techniques : List<Technique>)