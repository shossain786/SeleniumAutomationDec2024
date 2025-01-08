package org.saddy.oopstests;

import org.saddy.oops.BankInterface;

public class DemoBank1 implements BankInterface {

    @Override
    public void displayBalance(long accountNo) {
        System.out.println("show balance from DemoBank1");
    }

    @Override
    public void deposit(int amount, long accountNo) {
        System.out.println("Deposit amount in DemoBank1");
    }
}
