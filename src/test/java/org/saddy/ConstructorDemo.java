package org.saddy;

public class ConstructorDemo {

    int number = 100;
    public static void main(String[] args) {
//        A obj = new A(33 , 30);
//        A obj1 = new A();

//        ConstructorDemo constructorDemo = new ConstructorDemo();
//        System.out.println(constructorDemo.number);

//        obj.method1();
        A a = new A(10, 6, "sum");
    }
}


class A {
    public A(){
        System.out.println("Constructor called");
    }
    int num, num1;

    public A(int num, int num1, String operation) {
        this.num = num;  //this ->A obj =  new A();
        this.num1 = num1;
        this.method1();
    }

    public A(int num) {
        System.out.println("Number passed: " + num);
    }

    public A(int num, int num2) {
        System.out.println(num + num2);
    }

    public void method1() {
        System.out.println("Method 1");
    }
    public void method2() {
        System.out.println("Method 2");
    }
}
