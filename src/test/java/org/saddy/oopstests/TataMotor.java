package org.saddy.oopstests;

import org.saddy.oops.Vehicle;

public class TataMotor extends Vehicle {
    public static void main(String[] args) {
        TataMotor tataMotor = new TataMotor();
        tataMotor.getRun();
        tataMotor.sound();
    }

    void getRun() {
        run();
    }


    @Override
    public void sound() {
        System.out.println("TataMotor Sound method called");
    }
}
