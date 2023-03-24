package com.tw.ddd_workshop.application.service;

import java.math.BigDecimal;
import java.util.Map;

public class CompetitorPriceProvider {

    private static final Map<String, BigDecimal> competitorPriceMap = Map.of("Apple Pencil", BigDecimal.TEN);

    public BigDecimal getCompetitorPrice(String productName) {
        return competitorPriceMap.get(productName);
    }
}
