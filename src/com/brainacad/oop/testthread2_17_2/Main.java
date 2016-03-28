package com.brainacad.oop.testthread2_17_2;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        new Thread(bomb1).start();
    }
}
