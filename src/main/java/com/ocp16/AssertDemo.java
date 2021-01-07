package com.ocp16;

import java.util.Random;

public class AssertDemo {
    public static void main(String[] args) {
        int x = new Random().nextInt(100);
        //假設 x 都應該要 >= 60
        assert (x >= 60) : "發生 Assert 錯誤, 挑戰失敗, x =" + x;
        System.out.printf("%d >= 60 正確\n", x);
    }
}
