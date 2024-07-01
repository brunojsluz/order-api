package com.luzlabs.order_api.models

import java.math.BigDecimal

data class OrderItemModel (
    val productId: Long,
    val description: String,
    val quantity: Int,
    val unitPrice: BigDecimal,
    val totalPrice: BigDecimal
)
