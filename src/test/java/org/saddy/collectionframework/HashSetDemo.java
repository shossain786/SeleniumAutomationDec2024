package org.saddy.collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Perl");
        hashSet.add("C#");
        hashSet.add("Java");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);

//        for (String data : hashSet)
//            System.out.println(data);
//        Iterator<String> itr = hashSet.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());
    }
}
