package com.luzlabs.order_api.controller.mapper

import com.luzlabs.order_api.controller.resource.OrderResponse
import com.luzlabs.order_api.models.OrderModel

class OrderResponseMapper {
    companion object {
        fun mapFrom(order: OrderModel): OrderResponse {
            return OrderResponse(
                id = order.id,
                orderDate = order.orderDate,
                subTotal = order.subTotal,
                taxes = order.taxes,
                shipping = order.shipping,
                total = order.total,
                currency = order.currency,
                notes = order.notes
            )
        }
    }
}
