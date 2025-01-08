package org.saddy.oopstests;

import org.saddy.oops.BankInterface;
import org.saddy.oops.DemoInterface;

public class DemoBank implements BankInterface, DemoInterface {
    @Override
    public void displayBalance(long accountNo) {
        System.out.println("Showing the balance");
    }

    @Override
    public void deposit(int amount, long accountNo) {
        System.out.println(amount + " is Deposited successfully to account " +
                "number: " + accountNo);
    }

    @Override
    public void printName() {
        System.out.println("Print Name");
    }
}
