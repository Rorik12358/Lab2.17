package com.brainacad.oop.testthread2_17_7;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class DiningHall implements Runnable{
    static Integer pizzaNum = 0;
    static Integer studentID = 0;

    public void makePizza() {
        pizzaNum++;
    }

    @Override
    public void run() {
        String result;
        synchronized (pizzaNum) {
            if (pizzaNum > 0) {
                result = "Served ";
                pizzaNum--;
            } else result = "Starved ";
        }
        synchronized (studentID) {
            System.out.println(result + studentID);
            studentID++;
        }
    }


    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i < 10; i++) {
            d.makePizza();
        }
        for (int i = 0; i < 20; i++) {
            new Thread(d).start();
        }
    }
}
