package com.brainacad.oop.testthread2_17_8;

import java.util.Random;

/**
 * Created by m18 on 28.03.2016.
 */
public class Transfer implements Runnable {
    private Bank bank;
    private int from;
    private int max;

    public Transfer(Bank bank, int from, int max_amount) {
        this.bank = bank;
        this.from = from;
        max = max_amount;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (bank) {
                bank.transfer(from, random.nextInt(bank.getNumberAccounts()), random.nextInt(max));
            }
        }
    }
}
