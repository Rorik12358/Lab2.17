package com.brainacad.oop.testthread2_17_6;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class Printer extends Thread {
    private Storage number;
    private volatile boolean printing = true;

    public Printer(Storage number) {
        this.number = number;
    }

    public boolean isPrinting() {
        return printing;
    }

    public void setPrinting(boolean printing) {
        this.printing = printing;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            synchronized (number) {
                System.out.println(number.getValue());
                printing = false;
                number.notifyAll();
                try {
                    number.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
