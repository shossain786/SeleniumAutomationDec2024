package org.saddy.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class VariableDemo {

    int x = 10;         //instance variable/Global Variable/class level variable
    int z;
    String str;
    int[] array;
    ArrayList<Integer> arrayList;
    boolean flag;

    public static void main(String[] args) {
        int y = 20;         //local variable
        VariableDemo obj = new VariableDemo();
        int a = 0;
        String s = "";
//        System.out.println(obj.x);
//        System.out.println(y);
        System.out.println(obj.z);
        System.out.println(obj.str);
        System.out.println(Arrays.toString(obj.array));
        System.out.println(obj.arrayList);
        System.out.println(obj.flag);
        System.out.println(a);
        System.out.println(s);
//        m1();
    }
    void m1() {

    }
    void m2() {
        System.out.println(x);
//        System.out.println(y); // y is not visible/accessible from different method
    }
}
