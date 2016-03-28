package com.brainacad.oop.testthread2_17_1;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class MyTimeBomb extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
    }
}
