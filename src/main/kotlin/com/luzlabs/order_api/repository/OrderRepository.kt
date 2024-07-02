package com.luzlabs.order_api.repository

import com.luzlabs.order_api.models.OrderModel
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<OrderModel, Long> {
}