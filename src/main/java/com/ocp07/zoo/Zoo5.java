package com.ocp07.zoo;

public class Zoo5 {
    public static void main(String[] args) {
        Animal[] animals = {
          new Bird("鸚鵡", 2),
          new Lion("美洲獅", 4),
          new Ostrich("非洲鴕鳥", 2)
        };
        
        System.out.println(animals);
        int sum = 0;
        for(Animal animal : animals) {
            System.out.println(animal);
            sum += animal.getFoot();
        }
        System.out.printf("總共 %s 隻腳", sum);
    }
}
