package org.saddy.basics;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class WhileLoopDemo {
    WebDriver driver;
    public static void main(String[] args) {
        int num = 0;

//        while (num < 10) {
//            System.out.println(num);
//            num +=3;
//        }

        while (true) {
            int num1 = 0, num2 = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select the options from below: \n" +
                    "1: Summation.\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit");
            int option = scanner.nextInt();
            if (option != 5) {
                System.out.println("Please enter a number: ");
                num1 = scanner.nextInt();
                System.out.println("Please enter another number: ");
                num2 = scanner.nextInt();
            }
            switch (option) {
                case 1:
                    calSum(num1, num2);
                    break;
                case 2:
                    calSub(num1, num2);
                    break;
                case 3:
                    calMul(num1, num2);
                    break;
                case 4:
                    calDiv(num1, num2);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid choice!!");
            }
        }
    }
    static void calSum(int a, int b) {
        System.out.println("Sum is: " + (a+b));
    }
    static void calSub(int a, int b) {
        System.out.println("Sum is: " + (a-b));
    }
    static void calMul(int a, int b) {
        System.out.println("Sum is: " + (a*b));
    }
    static void calDiv(int a, int b) {
        System.out.println("Sum is: " + (a/b));
    }
}
