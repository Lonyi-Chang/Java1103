package com.ocp7;

public class Num {
    private static int m; //共用類別(static
    private int n;
    public void runFiveTimes() {
        for(int i = 1;i <= 5;i++) {
            m++;
            n++;
        }
    }
    
    @Override
    public String toString() {
        return "m=" + m + ", n=" + n;
    }
}
