package com.nhlstenden.Customer;

import com.nhlstenden.DiscountStrategy;

public class NoDiscount implements DiscountStrategy {

    private static double NO_DISCOUNT_PERCENTAGE = 0;


    @Override
    public double getPriceWithDiscount(int price) {

        return price - (price * (NO_DISCOUNT_PERCENTAGE/100));
    }
}
