package de.telran.homeWork_14_09;

public class BankAccount {
    int balance;
    String name;

    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public int giveMeMaxMoney() {
        int x;
        int withdraw = 0;

        if (balance > 1) {
            x = balance - 1;
        } else {
            x = 1;
        }

        do {
            if (balance % x == 0) {
                balance = balance - x;
                withdraw = x;
                break;
            }
            x--;
        } while (x >= 1);
        return withdraw;
    }
}

