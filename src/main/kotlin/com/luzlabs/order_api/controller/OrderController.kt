package com.luzlabs.order_api.controller

import com.luzlabs.order_api.controller.resource.OrderRequest
import com.luzlabs.order_api.controller.resource.OrderResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/order")
class OrderController {

    @GetMapping("/{id}")
    fun getOrderById(id: Long): OrderResponse? {
        return null;
    }

    @GetMapping
    fun listOrders(): List<OrderResponse>? {
        return null;
    }

    @PostMapping
    fun createOrder(@RequestBody request: OrderRequest) {


    }
}