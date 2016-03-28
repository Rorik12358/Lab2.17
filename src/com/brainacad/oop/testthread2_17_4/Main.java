package com.brainacad.oop.testthread2_17_4;


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
        MySumCount count1 = new MySumCount();
        MySumCount count2 = new MySumCount();

        count1.setArr(myArray);
        count1.setStartIndex(1);
        count1.setStopIndex(500);
        Thread sumCount1 = new Thread(count1);

        count2.setArr(myArray);
        count2.setStartIndex(1);
        count2.setStopIndex(500);
        Thread sumCount2 = new Thread(count2);
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
        System.out.println("Sum of array elements: "+count1.getResultSum());
        System.out.println("Sum of array elements: "+count2.getResultSum());
    }
}
