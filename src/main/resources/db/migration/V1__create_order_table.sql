create table orders (
    id serial primary key,
    order_date datetime not null,
    sub_total numeric(10, 2) not null,
    taxes numeric(10, 2) not null,
    shipping numeric(10, 2) not null,
    total numeric(10, 2) not null,
    notes varchar(255),
    currency varchar(20),
    primary key (id)
);