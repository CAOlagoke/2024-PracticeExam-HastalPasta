package com.nhlstenden.Order;

import com.nhlstenden.Consumables.Alcohol;
import com.nhlstenden.Consumables.Consumable;
import com.nhlstenden.Consumables.Drink;
import com.nhlstenden.Consumables.NoMoreAlcoholicDrinksException;

public class Buffet extends Order{

    private static final int MAX_ALCOHOLIC_DRINK_ALLOWED = 4;
    private int BUFFET_PRICE = 58080;

    public Buffet() {
        super();
    }

    public void addConsumable(Consumable consumable) throws NoMoreAlcoholicDrinksException {
        //This method only adds drinks to the list of consumables

        if(consumable instanceof Drink){
            if(consumable instanceof Alcohol){
                if((getAlcoholicDrinkCount() + 1) > MAX_ALCOHOLIC_DRINK_ALLOWED){
                    throw new NoMoreAlcoholicDrinksException();
                }else{
                    super.getConsumables().add(consumable);
                }
            }else{
                super.getConsumables().add(consumable);
            }
        }
    }

    public int getPrice(){
        //This method calculates the price of a buffet, by adding the buffet_price to the totalPrice of the list of consumables
        int priceOfBuffet = 0;
        priceOfBuffet+= BUFFET_PRICE;

        for(Consumable consumable: super.getConsumables()){
            priceOfBuffet+= consumable.getPrice();
        }

        return priceOfBuffet;
    }

}
