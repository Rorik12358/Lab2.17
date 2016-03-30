package com.brainacad.oop.testdeadlock2_17_10;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by R2-D2 on 29.03.2016.
 */
public class MyThread extends Thread {
    MyObject myObject1;
    MyObject myObject2;
    MyObject myObject3;

    public MyThread(MyObject myObject1, MyObject myObject2, MyObject myObject3) {
        this.myObject1 = myObject1;
        this.myObject2 = myObject2;
        this.myObject3 = myObject3;
    }

    @Override
    public void run() {
        Lock lock = new ReentrantLock();
        if (lock.tryLock()) {
        }

    }

    //    @Override
//    public void run() {
//        synchronized (myObject1){
//            System.out.println(getName()+": Holding lock 1...");
//            System.out.println(getName()+": Waiting for lock 1...");
//            synchronized (myObject2){
//                System.out.println(getName()+": Holding lock 2...");
//                System.out.println(getName()+": Waiting for lock 2...");
//                synchronized (myObject3){
//                    System.out.println(getName()+": Holding lock 3...");
//                    System.out.println(getName()+": Waiting for lock 3...");
//                }
//            }
//        }
//    }
}
