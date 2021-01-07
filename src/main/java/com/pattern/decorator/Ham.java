package com.pattern.decorator;

public class Ham extends SitDish{
    
    public Ham(Food food) {
        super(food);
        name = "火腿";
        price = 30;
    }
    
}
