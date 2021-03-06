package com.ocp14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueuDemo {
    public static void main(String[] args) {
        Queue<String>pokers = new LinkedList<>();
        for (int i = 1; i <= 10; i++) pokers.add(i+"");//FOR迴圈可以只有一行不需大括號
        pokers.add("J");pokers.add("Q");pokers.add("K");
        System.out.println(pokers);
        //洗牌?
        Collections.shuffle((List)pokers);
        System.out.println(pokers);
        String card1 = pokers.poll();
        String card2 = pokers.poll();
        System.out.println(card1);
        System.out.println(card2);
        //計算分數
        double score = getScore(card1) + getScore(card2);
        System.out.println(score);
        //剩餘的牌
        System.out.println(pokers);
    }
    
    public static double getScore(String card) {
        return "JQK".contains(card) ? 0.5 : Double.parseDouble(card);
    }
    public static double getScore(String card1, String card2) {
        return getScore(card1) + getScore(card2);
    }
}
