package com.ocp;

public class PrintStars2 {
    public static void main(String[] args) {
        int line = 5;
        for (int i = 1; i <= line; i++) {
            for (int j = line; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
