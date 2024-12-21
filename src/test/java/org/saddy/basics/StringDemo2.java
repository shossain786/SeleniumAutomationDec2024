package org.saddy.basics;

import java.util.Arrays;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "Java";
        s = s + " Selenium  Programming";
//
//        s = s.concat(" Programming");

        System.out.println(s);
//        System.out.println(s.length());
//        System.out.println(s.trim());
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.toCharArray());
//        char[] chars = s.toCharArray();
//        for (char ch : chars)
//            System.out.println(ch);
//        System.out.println(s.replace("Java", "Python"));
//        System.out.println(s.replace("e", "a"));
//        System.out.println(s.replaceFirst("e", "a"));
//        System.out.println(s.replaceAll("e", "a"));
//        System.out.println(s.startsWith("java"));
//        System.out.println(s.endsWith("nium"));
//        System.out.println(s.contains("a Sr"));
//         s = "";
//        System.out.println(s.isEmpty());
//        System.out.println(s.equals("Java selenium"));
//        System.out.println(s.equalsIgnoreCase("Java selenium"));
//        System.out.println(s.charAt(0));
//        for (int i = 0; i < s.length(); i ++)
//            System.out.println(s.charAt(i));
//        System.out.println(s.indexOf("a"));
//        System.out.println(s.lastIndexOf("a"));
//        System.out.println(s.substring(2, 7));
//        System.out.println(s.substring(6));
//        welcome, to Java Selenium Programming
//        Hello, to Java Selenium Programming
        String s1 = "Hello, to, Java,Selenium,Programming";
        String[] array = s1.split(",");
        for (String str : array)
            System.out.println(str.trim());
    }
}
