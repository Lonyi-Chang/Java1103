package com.ocp18_thread;

public class Runner extends Thread{
    
    //執行緒的程式進入點
    
    
    @Override
    public void run() {
        
    }

    public void job() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3000; i++) {
            System.out.println();
        }
    }
}