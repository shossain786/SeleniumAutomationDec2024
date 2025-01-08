package org.saddy.oops;

public abstract class Vehicle {

    public void run() {
        System.out.println("Vehicle is running");
    }

    public abstract void sound();
}

// we can not create object of an abstract class.