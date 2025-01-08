package org.saddy.oops;

public interface BankInterface {
    String name = "ABC BANK";

    void displayBalance(long accountNo);

    void deposit(int amount, long accountNo);
}


//all members are by default public and abstract