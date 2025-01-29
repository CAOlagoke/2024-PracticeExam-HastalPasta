package com.nhlstenden.Customer;

import com.nhlstenden.DiscountStrategy;

public class EmployeeDiscount implements DiscountStrategy {


    private static double EMPLOYEE_DISCOUNT_PERCENTAGE = 22.5;

    public EmployeeDiscount() {
    }

    @Override
    public double getPriceWithDiscount(int price) {

        return price - (price * (EMPLOYEE_DISCOUNT_PERCENTAGE/100));
    }
}
