package com.nhlstenden.Consumables;

public class NoMoreAlcoholicDrinksException extends Exception{

    public NoMoreAlcoholicDrinksException() {
        super("Alcoholic Drink Limit reached, Maxed allowed Alcoholic Drinks is 4!");
    }
}
