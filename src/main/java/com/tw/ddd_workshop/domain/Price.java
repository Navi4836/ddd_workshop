package com.tw.ddd_workshop.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {

    private BigDecimal amount;

    private Currency currency = Currency.getInstance("USD");

    public Price(BigDecimal amount) {
        this.amount = amount;
    }

    /*public Price reduceBy(float percent) {
        amount.subtract()
    }*/

    @Override
    public String toString() {
        return "Price{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}
