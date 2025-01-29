package com.nhlstenden.Order;

import com.nhlstenden.Consumables.Alcohol;
import com.nhlstenden.Consumables.Consumable;
import com.nhlstenden.Consumables.NoMoreAlcoholicDrinksException;
import com.nhlstenden.Payable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Order implements Payable {

    private LocalDate dateOfOrder;
    private List<Consumable> consumables;
    private static int MAX_ALCOHOLIC_DRINK_ALLOWED = 4;
    public Order() {
        this.dateOfOrder = LocalDate.now();
        this.consumables = new ArrayList<>();
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public List<Consumable> getConsumables() {
        return consumables;
    }

    public void setConsumables(List<Consumable> consumables) {
        this.consumables = consumables;
    }

    public void addConsumable(Consumable consumable) throws NoMoreAlcoholicDrinksException {

        if(consumable instanceof Alcohol){
            if((getAlcoholicDrinkCount() + 1) > MAX_ALCOHOLIC_DRINK_ALLOWED){
                throw new NoMoreAlcoholicDrinksException();
            }else{
                this.consumables.add(consumable);
            }
        }else{
            this.consumables.add(consumable);
        }
    }

    public int getAlcoholicDrinkCount(){

        int alcoholicDrinkCounter = 0;

        for(Consumable consumable : getConsumables()){

            if(consumable instanceof Alcohol){
                alcoholicDrinkCounter++;
            }
        }
        return alcoholicDrinkCounter;
    }

    @Override
    public int getPrice() {

        int priceOfOrder = 0;

        for(Consumable consumable : getConsumables()){
            priceOfOrder+= consumable.getPrice();
        }

        return priceOfOrder;
    }
}
