package com.luzlabs.order_api.controller.mapper

import com.luzlabs.order_api.controller.resource.OrderItemRequest
import com.luzlabs.order_api.models.OrderItemModel

class OrderItemModelMapper {
    companion object {
        fun mapFrom(request: OrderItemRequest): OrderItemModel {
            return OrderItemModel(
                productId = request.productId,
                description = request.description,
                quantity = request.quantity,
                unitPrice = request.unitPrice,
                totalPrice = request.totalPrice
            )
        }
    }
}
