create table order_items (
    productId serial primary key,
    orderId integer not null,
    description varchar(255) not null,
    quantity integer not null,
    unitPrice numeric(10, 2) not null,
    totalPrice numeric(10, 2) not null,

    primary key (productId),
    foreign key (orderId) references orders(id)
);