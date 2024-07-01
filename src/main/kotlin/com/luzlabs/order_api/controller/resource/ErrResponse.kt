package com.luzlabs.order_api.controller.resource

data class ErrResponse (
    val status: Int,
    val message: String,
    val error: String,
    val path: String
)
