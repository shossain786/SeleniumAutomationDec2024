package org.saddy.accessmodifiers;

public class ClassA extends AccessModifiersDemo{
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        obj.m3();

        Demo demo = new Demo();

        demo.m1();
        demo.m2();
    }
}
