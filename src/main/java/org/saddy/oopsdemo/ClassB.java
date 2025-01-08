package org.saddy.oopsdemo;

import org.saddy.accessmodifiers.AccessModifiersDemo;

public class ClassB extends AccessModifiersDemo{
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        obj.m2();
        System.out.println(obj.num1);
    }
}
