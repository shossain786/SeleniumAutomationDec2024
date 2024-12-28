package org.saddy.collectionframework;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Java");
        treeSet.add("C");
        treeSet.add("Python");
        treeSet.add("C#");
        treeSet.add("Ruby");
        treeSet.add("Perl");
        treeSet.add("Ruby");

        System.out.println(treeSet);


//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Pune");
//        linkedList.add("Mumbai");
//
//        System.out.println(linkedList.get(1));
//
//        for (String city : linkedList)
//            System.out.println(city);
//        System.out.println(linkedList);
    }
}
