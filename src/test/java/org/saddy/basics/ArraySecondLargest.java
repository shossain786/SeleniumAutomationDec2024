package org.saddy.basics;

public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] nums = {23, 45, 21, 11, 10, 4, 56};
//        int[] nums = {40};
        int result = findSecondLargest(nums);
        System.out.println("Second Largest number: " + result);
    }

    static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Second largest can not be find as there is only one data in the array.");
            return 0;
        }
        int largest = 0;
        int secondLargest = 0;

        System.out.println("Finding the second largest");

        for (int num : nums) {
            if (num > largest){
                secondLargest = largest;
                largest = num;
            }
        }
        return secondLargest;
    }
}