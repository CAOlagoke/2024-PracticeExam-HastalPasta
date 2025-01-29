package com.nhlstenden;

import com.nhlstenden.Consumables.Alcohol;
import com.nhlstenden.Consumables.NoMoreAlcoholicDrinksException;
import com.nhlstenden.Customer.Customer;
import com.nhlstenden.Customer.EmployeeDiscount;
import com.nhlstenden.Customer.NoDiscount;
import com.nhlstenden.Order.ALaCarte;
import com.nhlstenden.Order.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PizzaRestaurantTest {

    private PizzaRestaurant pizzaRestaurant;

    @BeforeEach
    void setUp() {
        this.pizzaRestaurant = new PizzaRestaurant("Today Popups");

    }

    @Test
    void PizzaRestaurant_ordersMoreThan4AlcoholicDrinks_ThrowsNoMoreAlcoholicDrinksException() throws NoMoreAlcoholicDrinksException {

        Order customerOrders = new ALaCarte();

        customerOrders.addConsumable(new Alcohol("tookie", 15.5));
        customerOrders.addConsumable(new Alcohol("tookie", 15.5));
        customerOrders.addConsumable(new Alcohol("tookie", 15.5));
        customerOrders.addConsumable(new Alcohol("tookie", 15.5));

        assertThrows(NoMoreAlcoholicDrinksException.class, ()-> {

            customerOrders.addConsumable(new Alcohol("tookie", 15.5));
        });

    }

    @Test
    void PizzaRestaurant_ordersMoreThan4AlcoholicDrinks_DoesNotThrowNoMoreAlcoholicDrinksException() throws NoMoreAlcoholicDrinksException {

        Order customerOrders = new ALaCarte();

        customerOrders.addConsumable(new Alcohol("tookie", 15.5));
        customerOrders.addConsumable(new Alcohol("tookie", 15.5));
        customerOrders.addConsumable(new Alcohol("tookie", 15.5));

        assertDoesNotThrow(() -> customerOrders.addConsumable(new Alcohol("tookie", 15.5)));

    }

}