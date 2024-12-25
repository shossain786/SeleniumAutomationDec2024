package org.saddy.collectionframework;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Perl");
        arrayList.add("C#");
        arrayList.add("Java");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
//        arrayList.add(10); //not allowed to store different type of data
        System.out.println(arrayList);

        arrayList1.add(0);
        arrayList1.add(-12);
        arrayList1.add(34);

//        arrayList.add(5, "R");
//        arrayList.remove("C#");
//        arrayList.removeAll(Collections.singleton("Java"));
//        arrayList.clear();
//        System.out.println(arrayList.isEmpty());
//        List<String> subList = arrayList.subList(3, 7);
//        System.out.println(arrayList.indexOf("Java"));
//        System.out.println(arrayList.lastIndexOf("Java"));
//        Object[] array =arrayList.toArray();
//        System.out.println(Arrays.toString(array));


//        System.out.println(subList);

//        System.out.println(arrayList);
//        System.out.println(arrayList1);

//        System.out.println(arrayList.get(2));

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//        for (String data : arrayList) {
//            System.out.println(data);
//        }
//        Iterator to iterate though the arraylist
//         Iterator<String> iterator = arrayList.iterator();
//         while (iterator.hasNext()){
//             System.out.println(iterator.next());
//         }
    }
}
