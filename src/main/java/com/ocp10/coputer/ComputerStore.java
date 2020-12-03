package com.ocp10.coputer;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer= new Iphone();
        System.out.println(computer.add(10, 20));
        System.out.println(computer.getName());
        int volt = Computer.volt;
        System.out.println(Computer.volt);
//        Mobile mobile = new Android();
//        System.out.println(mobile.add(10, 20));
//        System.out.println(mobile.getName());
    }
}
