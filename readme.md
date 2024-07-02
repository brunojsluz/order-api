# Order API

A Order API é uma API para gerenciar pedidos de vendas. Ela permite criar novos pedidos, listar pedidos existentes e recuperar detalhes específicos de um pedido.

## Endpoints

### Criar um novo pedido


Este endpoint permite criar um novo pedido de venda.

#### Exemplo de Request

```bash
curl --location 'localhost:8080/v1/order' \
--header 'Content-Type: application/json' \
--data '{
    "subTotal": 75,
    "taxes": 12,
    "shipping": 9,
    "total": 96,
    "currency": "Reais Brasileiros",
    "notes": "Pedido para vendas",
    "items": [
        {
            "description": "Lâmpada super LED",
            "quantity": 3,
            "unitPrice": 25,
            "totalPrice": 75
        }
    ]
}'
```
#### Exemplo de Response
```bash
{
    "id": 1,
    "orderDate": "2024-07-02",
    "subTotal": 75.00,
    "taxes": 12.00,
    "shipping": 9.00,
    "total": 96.00,
    "currency": "Reais Brasileiros",
    "notes": "Pedido para vendas"
}
```

### Listar todos os pedidos
#### Exemplo de Request
```bash
GET /v1/order
```

#### Exemplo de Response
```bash
[
    {
        "id": 1,
        "orderDate": "2024-07-02",
        "subTotal": 75.00,
        "taxes": 12.00,
        "shipping": 9.00,
        "total": 96.00,
        "currency": "Brasilian Reais",
        "notes": "Order to salles"
    }
]
```