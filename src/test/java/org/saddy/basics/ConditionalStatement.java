package org.saddy.basics;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int num = scanner.nextInt();

        displayGrade(num);
//        verify the number is even/odd
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    public static void displayGrade(int number) {
        if (number >= 80) {System.out.println("Your Grade is: A+");
        } else if (number >= 70) {
            System.out.println("Your Grade is: A");
        } else if (number >= 60) {
            System.out.println("Your Grade is: B+");
        } else if (number >= 50) {
            System.out.println("Your Grade is: B");
        } else if (number >= 30) {
            System.out.println("Your Grade is: C");
        } else if (number < 30) {
            System.out.println("Your Grade is: F");
        }
    }
}

// Grading system: 80 > A+, 70>A, 60> B+, 50>B, 30>C, 30< F