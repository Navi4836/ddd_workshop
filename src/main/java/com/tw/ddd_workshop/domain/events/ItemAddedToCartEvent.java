package com.tw.ddd_workshop.domain.events;

import com.tw.ddd_workshop.domain.Product;

public class ItemAddedToCartEvent implements DomainEvent {

    private Product product;

    private int quantity;

    public ItemAddedToCartEvent(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
