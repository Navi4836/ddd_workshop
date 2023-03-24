package com.tw.ddd_workshop.domain.events;

public class ItemRemovedFromCardEvent implements DomainEvent {

    String productName;

    public ItemRemovedFromCardEvent(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
