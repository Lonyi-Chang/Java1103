package com.ocp09;
class Father {
    public Father() {
        System.out.println("Father no money");
    }
    public Father(int money) {
        System.out.println("Father's money = " + money);
    }
}

class Son extends Object {
    public Son() {
        super(); //可以不用寫
        //super(10000);
    }
}
public class Family {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
