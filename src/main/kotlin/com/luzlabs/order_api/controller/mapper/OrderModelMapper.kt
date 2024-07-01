package com.luzlabs.order_api.controller.mapper

import com.luzlabs.order_api.controller.resource.OrderRequest
import com.luzlabs.order_api.models.OrderModel

class OrderModelMapper {
    companion object {
        fun mapFrom(request: OrderRequest): OrderModel {
            return OrderModel(
                orderDate = request.orderDate,
                subTotal = request.subTotal,
                taxes = request.taxes,
                shipping = request.shipping,
                total = request.total,
                currency = request.currency,
                notes = request.notes,
                items = request.items.map { OrderItemModelMapper.mapFrom(it) }
            )
        }
    }

}
