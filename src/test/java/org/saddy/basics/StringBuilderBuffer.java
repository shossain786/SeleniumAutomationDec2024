package org.saddy.basics;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

//        stringBuffer.append("Java").append(" Selenium").append(" Programming");
//        System.out.println(stringBuffer);

        stringBuilder.append("Java");

        stringBuilder.append(" Selenium")
                .append(" Programming")
                .append(" Tutorial");

        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.reverse());
//        stringBuilder.append("Welcome to ", 0, 4);
//        stringBuilder.appendCodePoint(7);
//        stringBuilder.delete(5, 9);
//        stringBuilder.insert(5, 10000);
//        stringBuilder.insert(5, "With ");
        System.out.println(stringBuilder);
    }
}
