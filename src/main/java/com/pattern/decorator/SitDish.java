package com.pattern.decorator;

public class SitDish extends Food {
    
    protected Food food;
    
    public SitDish(Food food) {
        this.food = food;
    }
    
        @Override
    public String getName() {
        return name + " + " + food.getName();   
}
    @Override
    public int getPrice() {
        return price + food.getPrice();
    }
}


