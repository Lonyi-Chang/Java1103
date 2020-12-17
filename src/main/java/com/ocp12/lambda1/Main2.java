package com.ocp12.lambda1;

public class Main2 {
    public static void main(String[] args) {
        //Java 8 Lambda
        Add add = (int x, int y) -> System.out.println(x + y);
        add.sum(10, 20);
        Add add2 = (int x, int y) -> { //可不加型態(int,double..)
            System.out.println(x * y);
            System.out.println(y / x);
        }; 
        add2.sum(10, 20);
    }
}
