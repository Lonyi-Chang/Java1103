package com.ocp08;

import java.util.Arrays;

public class Main {
    // 主程式
    public static void main(String[] args) {
        // 開公司
        RentalCompany rc = new RentalCompany();
        // 查看庫存
        Transportation[] trans = rc.getTransportations();
        System.out.println("目前庫存:" + Arrays.toString(trans));
        int subtotal = 0;
        //租一台車
        for(Transportation ts : trans) {
            if(ts instanceof Car) {
                ((Car)ts).play(); //一種轉型方式
                
                //Car car = (Car)ts; //第2種轉型成car
                //car.play();
                
                System.out.printf("我要租%s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
                subtotal += 1*ts.getPrice();
            }
            if(ts instanceof Bicycle) {
                ((Bicycle) ts).message();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
                subtotal += 1*ts.getPrice();
            }
            if(ts instanceof Airplane) {
                ((Airplane) ts).service();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
                subtotal += 1*ts.getPrice();
            }
        }
        //更新後的庫存資料
        System.out.println("更新後庫存：" + Arrays.toString(trans));
        //試問總租金是?
        System.out.printf("總租金$%,d\n", subtotal);
    }
}
