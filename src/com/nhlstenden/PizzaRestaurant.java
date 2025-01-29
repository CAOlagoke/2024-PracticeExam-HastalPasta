package com.nhlstenden;

import com.nhlstenden.Customer.Customer;
import com.nhlstenden.Order.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PizzaRestaurant {

    private String name;
    private Map<Customer, List<Order>> orders;

    public PizzaRestaurant(String name) {
        this.name = name;
        this.orders = new HashMap<>();
    }

    public double payBill(Customer customer){
        //This method is used to calculate the bill of a client and calls removeCustomer to remove the client from the Map
        int bill = 0;

        if(customerExists(customer)){

            List<Order> customerOrders = getOrders().get(customer);

            for(Order order: customerOrders){
                bill+= order.getPrice();
            }
        }
        //Test the bill works first then remove the customer
        return customer.getDiscountStrategy().getPriceWithDiscount(bill);
    }

    public boolean customerExists(Customer customer){

        if(this.orders.containsKey(customer)){
            return true;
        }
        return false;
    }

    public boolean removeCustomer(Customer customer){

        if(customerExists(customer)){
            this.orders.remove(customer);
        }

        return false;
    }

    public void addOrderToCustomer(Customer customer, Order order){

        if(customerExists(customer)){

            this.orders.get(customer).add(order);
        }else{

            List<Order> customerOrders = new ArrayList<>();
            customerOrders.add(order);

            this.orders.put(customer, customerOrders);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Customer, List<Order>> getOrders() {
        return this.orders;
    }

    public void setOrders(Map<Customer, List<Order>> orders) {
        this.orders = orders;
    }
}
