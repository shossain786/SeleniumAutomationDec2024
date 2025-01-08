package org.saddy.oops;

public class OverloadDemo {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}


class A {
    void m1() {
        System.out.println("M1 without argument");
    }

    void m1(int num) {
        System.out.println("M1 with int argument");
    }
    void m1(String name) {
        System.out.println("M1 with String argument");
    }
    void m1(int num, String name) {
        System.out.println("M1 with int and String argument");
    }
}