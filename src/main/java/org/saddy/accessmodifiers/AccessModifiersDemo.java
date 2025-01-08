package org.saddy.accessmodifiers;

public class AccessModifiersDemo {
    int num = 100;
    public int num1 = 101;
    protected int num2 = 102;
    private int num3 = 103;

    void m1(){
        System.out.println("Default method");
    }

    public void m2(){
        System.out.println("Public method");
    }
    protected void m3(){
        System.out.println("Protected method");
    }
    private void m4(){
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        System.out.println(obj.num3);
    }
}


class Demo{
    void m1() {
        System.out.println("Inside Demo class.");
    }

    protected void m2() {
        System.out.println("protected in Demo");
    }
}

class Demo1 extends Demo{
    public void demo1(){

    }
}