package com.brainacad.oop.testthread2_17_6;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Storage number = new Storage();
        Printer printer = new Printer(number);
        Counter counter = new Counter(number, printer);
        counter.start();
        printer.start();
    }
}
