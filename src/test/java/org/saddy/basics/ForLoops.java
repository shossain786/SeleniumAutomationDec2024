package org.saddy.basics;

public class ForLoops {
    public static void main(String[] args) {
//        for (int i = 0; i <= 100; i ++)
//            if (i % 2 != 0)
//                System.out.println(i);
//        int i = 0;
//        for ( ; ; ) {
//            i++;
//            if (i > 20)
//                break;
//            if (i % 5  == 0)
//                continue;
//            System.out.println(i);
//
//        } 
//        Nested for loop
        for (int i = 0; i<=5; i++) {
            for (int j = 5; j >=0 ; j--)
                System.out.print(i + "," + j +" ");
            System.out.print("\n");
        }
    }
}
