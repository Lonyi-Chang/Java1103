package com.ocp07.zoo;

public class Animal {
    private String name;
    private int foot;

    public Animal() {
    }

    public Animal(String name, int foot) {
        this.name = name;
        this.foot = foot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }
    
    public void move(){
        System.out.println("移動");
    }
    
    @Override
    public String toString() {
        //若使用getName(沒有simple)會顯示com.ocp7.zoo.Bird(不好看
        String className = getClass().getSimpleName(); 
        return className + ":" + name + " 有 " + foot + " 隻腳";
    }
    
}
