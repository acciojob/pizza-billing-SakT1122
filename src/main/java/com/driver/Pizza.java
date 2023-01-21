package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheeseCost;
    private int extraToppingsCost;
    private int extraTakewayCost;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean isBillGenerated;
    private boolean extraTakewayAdded;
    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        bill = "";
        price = (isVeg) ? 300 : 400;
        extraCheeseCost = 80;
        extraToppingsCost = (isVeg) ? 70 : 120;
        extraTakewayCost = 20;
        extraCheeseAdded = false;
        extraToppingsAdded = false;
        isBillGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded){
            price+=extraCheeseCost;
            extraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded){
            price+=extraToppingsCost;
            extraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!extraTakewayAdded){
            price+=extraTakewayCost;
            extraTakewayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            bill+="Base Price Of The Pizza: "+((isVeg)?300:400)+"\n";
            bill+=(!extraCheeseAdded)?"":"Extra Cheese Added: "+extraCheeseCost+"\n";
            bill+=(!extraToppingsAdded)?"":"Extra Toppings Added: "+extraToppingsCost+"\n";
            bill+=(!extraTakewayAdded)?"":"Paperbag Added: "+extraTakewayCost+"\n";
            bill+="Total Price: "+String.valueOf(price)+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
