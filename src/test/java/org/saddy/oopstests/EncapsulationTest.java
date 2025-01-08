package org.saddy.oopstests;

import org.saddy.oops.EncapsulationDemo;

public class EncapsulationTest {
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.setAccountBalance(20000);
        System.out.println(encapsulationDemo.getAccountBalance());
    }
}
