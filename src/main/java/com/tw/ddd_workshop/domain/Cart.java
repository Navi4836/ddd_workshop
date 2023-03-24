package com.tw.ddd_workshop.domain;

import com.tw.ddd_workshop.domain.events.DomainEvent;
import com.tw.ddd_workshop.domain.events.ItemAddedToCartEvent;
import com.tw.ddd_workshop.domain.events.ItemRemovedFromCardEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Cart {

    private final UUID id;
    private final List<Item> items;
    //private List<DomainEvent> events = new ArrayList<>();
    private final List<Product> removedProducts;

    public Cart() {
        this.id = UUID.randomUUID();
        this.items = new ArrayList<>();
        this.removedProducts = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        List<Item> itemsToBeRemoved = items.stream().filter(
                cartItem -> cartItem.getProduct().equals(item.getProduct())
        ).toList();
        itemsToBeRemoved.forEach(itemToRemove -> items.remove(itemToRemove));
        removedProducts.add(item.getProduct());
        //registerItemRemovedEvent(item);
    }

    /*public List<String> removedProducts() {
        return this.events.stream().filter(
                event -> event instanceof ItemRemovedFromCardEvent
        ).map(event -> {
            ItemRemovedFromCardEvent itemRemovedFromCardEvent = (ItemRemovedFromCardEvent) event;
            return itemRemovedFromCardEvent.getProductName();
        }).toList();
    }


    private void registerItemRemovedEvent(Item item) {
        ItemRemovedFromCardEvent event = new ItemRemovedFromCardEvent(item.getProduct().getName());
        this.events.add(event);
    }*/


    public List<Item> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", items=" + items +
                ", removedProducts=" + removedProducts +
                '}';
    }
}
