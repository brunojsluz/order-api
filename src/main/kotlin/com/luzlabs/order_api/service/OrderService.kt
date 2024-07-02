package com.luzlabs.order_api.service

import com.luzlabs.order_api.models.OrderModel
import com.luzlabs.order_api.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(private val repository: OrderRepository) {

    fun createOrder(order: OrderModel): OrderModel {
        return repository.save(order)
    }

    fun deleteOrder(id: Long) {
        TODO("Not yet implemented")
    }

    fun getAll(): List<OrderModel> {
        return repository.findAll().toList()
    }
}