package com.luzlabs.order_api.controller.resource

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

data class OrderRequest(
    @field:NotNull
    val subTotal: BigDecimal,
    @field:NotNull
    val taxes: BigDecimal,
    @field:NotNull
    val shipping: BigDecimal,
    @field:NotNull
    val total: BigDecimal,
    @field:NotEmpty
    val currency: String,
    val notes: String,
    @field:NotNull
    val items: List<OrderItemRequest>
)
