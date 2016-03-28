package com.brainacad.oop.testthread2_17_8;

/**
 * Created by m18 on 28.03.2016.
 */
public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) {
        //...
        // COMPLETE
        //..
        Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
        for (int i = 0; i < N_ACCOUNTS; i++) {
            Transfer transfer = new Transfer(bank, i, bank.totalBalance());
            new Thread(transfer).start();
        }
    }
}
