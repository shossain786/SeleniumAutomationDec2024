package org.saddy.basics;
/*
    Write a program to find out the factorial value of a given number
*/

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int result = factorial(number);
        System.out.println("Factorial value of the given number: " + number + " is: " + result);

    }

    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return  1;
        } else {
            return num * factorial(num-1);
        }
    }
}
