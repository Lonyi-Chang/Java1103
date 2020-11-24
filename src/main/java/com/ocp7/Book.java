package com.ocp7;

public class Book {
    public static String publishName = "goTop";
    private String name;
    private int price;

    public Book() {
        System.out.println("執行 BOOK 建構子1"); //未帶參數執行此
    }
    
    public Book(String name, int price) {  //有帶參數執行此
        System.out.println("執行 BOOK 建構子2");
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "publishName=" + publishName + ", name=" + name + ", price=" + price + '}';
    }
    
}