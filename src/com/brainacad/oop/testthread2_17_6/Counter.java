package com.brainacad.oop.testthread2_17_6;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class Counter extends Thread {
    private Storage number;
    private Printer printer;
    private boolean counting = false;

    public Counter(Storage number, Printer printer) {
        this.number = number;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            synchronized (number) {
                if (printer.isPrinting()) {
                    try {
                        number.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                number.setValue(number.getValue() + 1);
                printer.setPrinting(true);
                number.notifyAll();
            }
        }
    }
}

