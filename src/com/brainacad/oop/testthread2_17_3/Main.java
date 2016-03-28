package com.brainacad.oop.testthread2_17_3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(1000);
        }
        MySumCount sumCount1 = new MySumCount();
        MySumCount sumCount2 = new MySumCount();

        sumCount1.setArr(myArray);
        sumCount1.setStartIndex(1);
        sumCount1.setStopIndex(199);

        sumCount2.setArr(myArray);
        sumCount2.setStartIndex(1);
        sumCount2.setStopIndex(199);
        System.out.println(Arrays.toString(myArray));
        sumCount1.start();
        try {
            sumCount1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sumCount2.start();
        try {
            sumCount2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of array elements: "+sumCount1.getResultSum());
        System.out.println("Sum of array elements: "+sumCount2.getResultSum());
    }
}
