package com.luzlabs.order_api.controller.resource

import java.math.BigDecimal
import java.time.LocalDate

data class OrderRequest(
    val orderDate: LocalDate,
    val subTotal: BigDecimal,
    val taxes: BigDecimal,
    val shipping: BigDecimal,
    val total: BigDecimal,
    val currency: String,
    val notes: String,
    val items: List<OrderItemRequest>
)
