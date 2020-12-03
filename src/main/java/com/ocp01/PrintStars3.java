package com.ocp01;

public class PrintStars3 {

    public static void main(String[] args) {
        int max = 9;
        int go = max*2-1; //5
        for (int i = 1; i <= max * 2 - 1; i++) {
            if (i <= max) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int m = i; m <= go; m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
