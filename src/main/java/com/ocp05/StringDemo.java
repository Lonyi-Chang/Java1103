package com.ocp05;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Java");  //一般String建立
        String s2 = new String("JAVA");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); //有分大小寫
        System.out.println(s1.equalsIgnoreCase(s2)); //不分大小寫
        String s3 = "JaVa";
        String s4 = "JaVa";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
