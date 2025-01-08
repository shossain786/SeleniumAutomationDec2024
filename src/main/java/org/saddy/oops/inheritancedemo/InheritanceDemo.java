package org.saddy.oops.inheritancedemo;

public class InheritanceDemo {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}

class A{
    protected void m1(){
        System.out.println("Inside A");
    }
    private void m4(){}
}

class B extends A{
    @Override
    protected void m1(){
        System.out.println("Inside B");
    }
    void m2(){
        System.out.println("Inside m2");
    }
}

class C extends B{
    protected void m1(){
        System.out.println("Inside C");
    }
    void m3(){
        System.out.println("Inside m3");
    }
}