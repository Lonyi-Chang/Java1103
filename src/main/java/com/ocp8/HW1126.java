/*
使程式能獨立租出Car/Bicycle/Airplane
參考MultiArray2
 */
package com.ocp8;

public class HW1126 {
    public static void main(String[] args) {
        int n = 2;
        Class[] classes = {Car.class, Bicycle.class, Airplane.class};
        
        RentalCompany rc = new RentalCompany();
        for (Class clazz : classes) {
            boolean success = rc.rentTransportation(clazz, n);
            System.out.printf("租 %s %s\n",
                    clazz.getSimpleName(), success?"成功" : "失敗");
        }
        //rc.rentTransportation(Car.class, 2);
        //rc.rentTransportation(Bicycle.class, 20);
        //rc.rentTransportation(Airplane.class, 3);
        rc.print();
    }
}
