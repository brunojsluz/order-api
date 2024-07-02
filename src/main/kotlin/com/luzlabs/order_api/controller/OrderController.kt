package com.luzlabs.order_api.controller

import com.luzlabs.order_api.controller.mapper.OrderModelMapper
import com.luzlabs.order_api.controller.mapper.OrderResponseMapper
import com.luzlabs.order_api.controller.resource.OrderRequest
import com.luzlabs.order_api.controller.resource.OrderResponse
import com.luzlabs.order_api.service.OrderService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder


@RestController
@RequestMapping("/v1/order")
class OrderController(private val orderService: OrderService) {

    @GetMapping("/{id}")
    fun getOrderById(id: Long): OrderResponse? {
        return null;
    }

    @GetMapping
    fun listOrders(): List<OrderResponse>? {
        return orderService.getAll().map { OrderResponseMapper.mapFrom(it) };
    }

    @PostMapping
    fun createOrder(@RequestBody @Valid request: OrderRequest, uri: UriComponentsBuilder): ResponseEntity<OrderResponse> {
        val response = OrderResponseMapper.mapFrom(orderService.createOrder(OrderModelMapper.mapFrom(request)))
        return ResponseEntity
            .created(uri.path("/order/${response.id}").build().toUri())
            .body(response)
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteOrder(id: Long) {
        orderService.deleteOrder(id)
    }
}