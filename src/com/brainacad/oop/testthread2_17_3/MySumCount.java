package com.brainacad.oop.testthread2_17_3;

/**
 * Created by R2-D2 on 27.03.2016.
 */
public class MySumCount extends Thread {
    private int startIndex;
    private int stopIndex;
    private int[] arr;
    private long resultSum;

    @Override
    public void run() {
        int sum = 0;
        for(int i = startIndex; i < stopIndex; i++){
            sum += arr[i];
        }
        resultSum = sum;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}
