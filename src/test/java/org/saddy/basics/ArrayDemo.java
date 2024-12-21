package org.saddy.basics;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        Declaration
//        int[] nums;
//        int []nums1;
//        int nums2[];
//        initialization
        int[] nums = new int[5];
        String[] names = new String[10];
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

        nums[3] = 6;
        nums[0] = 7;
        nums[1] = 2;
        System.out.println(Arrays.toString(nums));
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        enhanced for loop
//        for (int num : nums){
//            System.out.println(num);
//        }
        int[] nums2 = nums;

        System.out.println(Arrays.toString(nums2));
        nums[2] = 10;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = nums.clone();
        System.out.println(Arrays.toString(nums3));
        nums[4] = 34;
        System.out.println("======================");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        nums3[4] = 34;
        System.out.println(Arrays.toString(nums3));
        System.out.println( Arrays.equals(nums, nums3));
        System.out.println(nums == nums3);
        System.out.println(nums.length);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
//        for (int i = 0; i <= nums3.length; i++)
//            System.out.println(nums3[i]);
//        nums[10] = 33;
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
    }
}
