package com.pert.apimodels

data class StagedDetail(val description: String = "" ,
                        val title: String = "",
                        val headerImage: String? = null,
                        val image: String,
                        val order: Int = 100,
                        val quote: String,
                        val voice: String,
                        val speech : String,
                        val techniques : List<TechniqueApi> = listOf())