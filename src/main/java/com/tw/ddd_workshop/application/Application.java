package com.tw.ddd_workshop.application;

import com.tw.ddd_workshop.application.service.CompetitorPriceProvider;
import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Price;
import com.tw.ddd_workshop.domain.Product;
import com.tw.ddd_workshop.domain.Item;
import com.tw.ddd_workshop.domain.service.CompetitorDiscountService;

import java.math.BigDecimal;

public class Application {
    public static void main(String[] args) {

        Cart cart = new Cart();

        CompetitorPriceProvider competitorPriceProvider = new CompetitorPriceProvider();

        BigDecimal applePencilCompetitorPrice = competitorPriceProvider.getCompetitorPrice("Apple Pencil");
        Price applePencilDiscountedPrice = CompetitorDiscountService.discountedPrice(applePencilCompetitorPrice);

        Product applePencil = new Product("Apple Pencil", applePencilDiscountedPrice);
        Item pencil = new Item(applePencil, 2);
        cart.add(pencil);

        Product sonyWirelessHeadphone = new Product("Sony Wireless Headphone", new Price(BigDecimal.TEN));
        Item headphone = new Item(sonyWirelessHeadphone, 3);
        cart.add(headphone);

        Product anotherApplePencil = new Product("Apple Pencil", applePencilDiscountedPrice);
        Item anotherPencil = new Item(anotherApplePencil, 2);
        cart.add(anotherPencil);


        System.out.println("Item in Cart Before Removal");
        System.out.println("===========================");
        System.out.println(cart);

        cart.remove(new Item(new Product("Apple Pencil", applePencilDiscountedPrice), 2));

        System.out.println("Final Cart");
        System.out.println("============================");
        System.out.println(cart);

        System.out.println("Removed Products from Cart");
        System.out.println("=============================");
        System.out.println(cart.removedProducts());

    }
}