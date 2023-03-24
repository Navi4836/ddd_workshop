package com.tw.ddd_workshop.domain.service;

import com.tw.ddd_workshop.domain.Price;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompetitorDiscountService {

    public static Price discountedPrice(BigDecimal competitorPrice) {
        BigDecimal discountPercent = BigDecimal.valueOf(10);
        BigDecimal newValue = competitorPrice.subtract(
                competitorPrice.multiply(discountPercent).divide(BigDecimal.valueOf(100), RoundingMode.FLOOR)
        );
        return new Price(newValue);
    }
}