package com.brainacad.oop.testthread2_17_6;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class Printer extends Thread {
    Storage number;

    public Printer(Storage number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            synchronized (number) {
                System.out.println(number.getValue());
                number.notifyAll();
                if(i < 999_999){ //prevent deadlock at the end
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
