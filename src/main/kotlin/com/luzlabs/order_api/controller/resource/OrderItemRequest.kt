package com.luzlabs.order_api.controller.resource

import java.math.BigDecimal

data class OrderItemRequest (
    val productId: Long,
    val description: String,
    val quantity: Int,
    val unitPrice: BigDecimal,
    val totalPrice: BigDecimal
)
