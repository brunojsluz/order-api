package com.luzlabs.order_api.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.math.BigDecimal
import java.time.LocalDate

@Entity
data class OrderModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val orderDate: LocalDate,
    val subTotal: BigDecimal,
    val taxes: BigDecimal,
    val shipping: BigDecimal,
    val total: BigDecimal,
    val currency: String,
    val notes: String,

    val items: List<OrderItemModel>
)
