package com.ocp12.stream1;

import java.util.stream.Stream;

public class StringStream2 {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visual Basic"};
        //印出字串長度
        //Before Java 8
        for(String x : names) {
            if(x.length() <= 4) {
                System.out.println(x);
            }
        }
        
        //Java8
        Stream.of(names).filter(x -> x.length() <= 4).forEach(System.out::println);
    }
}
