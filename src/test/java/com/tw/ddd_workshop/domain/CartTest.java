package com.tw.ddd_workshop.domain;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CartTest {

    @Test
    public void ShouldAddOneItemToCart(){
        Item pencil = new Item(new Product("Apple Pencil",  new Price(BigDecimal.ONE)), 2);
        Cart cart = new Cart();

        cart.add(pencil);

        assertEquals(1, cart.getItems().size());
    }

    @Test
    public void ShouldAddMultipleItemsToCart(){
        Cart cart = new Cart();
        Item pencil = new Item(new Product("Apple Pencil",  new Price(BigDecimal.ONE)), 2);
        Item headphone = new Item(new Product("Sony Wireless Headphone",  new Price(BigDecimal.ONE)), 2);

        cart.add(pencil);
        cart.add(headphone);

        assertEquals(2, cart.getItems().size());
    }

    @Test
    public void ShouldRemoveItemFromCart(){
        Cart cart = new Cart();
        Item pencil = new Item(new Product("Apple Pencil",  new Price(BigDecimal.ONE)), 2);
        Item applePencil = new Item(new Product("Apple Pencil",  new Price(BigDecimal.ONE)), 2);
        Item headphone = new Item(new Product("Sony Wireless Headphone",  new Price(BigDecimal.ONE)), 2);

        cart.add(pencil);
        cart.add(applePencil);
        cart.add(headphone);

        System.out.println("Cart Before Removal " + cart);
        cart.remove(pencil);

        System.out.println("Cart After Removal " + cart);
        assertEquals(1, cart.getItems().size());
    }
}