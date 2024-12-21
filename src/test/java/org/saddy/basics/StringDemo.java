package org.saddy.basics;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println(s1 == str1);
        System.out.println(s1.equals(str1));
        System.out.println("------------------------");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}
