package com.nhlstenden.Customer;

import com.nhlstenden.DiscountStrategy;

public class Customer {


    private String name;
    private DiscountStrategy discountStrategy;

    public Customer(String name) {
        this.name = name;
        this.discountStrategy = new NoDiscount();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

}
