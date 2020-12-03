package com.ocp07.zoo;

public class Ostrich extends Bird{

    public Ostrich() {
    }

    public Ostrich(String name, int foot) {
        super(name, foot);
    }

    @Override
    public void move() {
        System.out.println("會走");
    }
    
}
