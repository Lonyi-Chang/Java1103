package com.ocp12.lambda4;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Print print = (x) -> System.out.println(x);
        Print print2 = System.out::println;
        
        print.display(100);
        print2.display(100);
        
        //使用Consumer
        //void accept(T t)
        Consumer<String> consumer = (x) -> System.out.println(x + x);
        consumer.accept("HA");
    }
}
