package com.brainacad.oop.testdeadlock2_17_10;

/**
 * Created by R2-D2 on 29.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        MyObject myObject3 = new MyObject();
        for (int i = 0; i < 3; ++i) {
            new MyThread(myObject1, myObject2, myObject3).start();
        }
    }
}
