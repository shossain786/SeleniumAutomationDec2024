package org.saddy.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class VariableDataType4 {
    public static void main(String[] args) {
//        byte a = -129;
//        byte a = 100;
//        int x = a; //implicit type casting
//        int b = 300;
//        short y =(short) x; //explicit type casting
//        byte b1 = (byte) b;
//        System.out.println(b1);

        int x = 100;
        Integer y = x; // Autoboxing
        System.out.println(y);
        int z = y; // Unboxing
        System.out.println(z);

        ArrayList<Integer> data = new ArrayList<>();
        data.add(x);
        System.out.println("Data from list: " + data.get(0));

        String str = "Java";
        boolean result = str instanceof String;
        System.out.println(result);

        String num = "1000";

        int num1 = Integer.valueOf(num);
        int num2 = 200;
        String str1 = String.valueOf(num2);

        // web -> number
        // getText() --> String

    }
}
