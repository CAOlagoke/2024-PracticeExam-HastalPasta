package com.nhlstenden.Consumables;

public class Alcohol extends Drink{

    private double alcoholPercentage;
    private static final int ALCOHOL_PRICE = 8000;

    public Alcohol(String name, double alcoholPercentage) {
        super(name, ALCOHOL_PRICE);
        this.alcoholPercentage = alcoholPercentage;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }


}
