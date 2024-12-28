package org.saddy.collectionframework;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("browser", "chrome");
        hashMap.put("url", "https://google.com");
        hashMap.put("uname", "admin");
        hashMap.put("pwd", "admin");
//        hashMap.put("pwd", "admin1");
        hashMap.put(null, "Hello");
        hashMap.put(null, "Hi");

        System.out.println("Hash Map: " + hashMap);

//        hashMap.putIfAbsent("pwd1", "admin111");
//        System.out.println(hashMap);
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("browser", "chrome");
        treeMap.put("url", "https://google.com");
        treeMap.put("uname", "admin");
        treeMap.put("pwd", "admin");
//        treeMap.put(null, "Hello"); // it don't allow to store data key as null
        treeMap.put("key", null);
        treeMap.put("key1", null);
        treeMap.put("key2", null);

        System.out.println("\nTree Map:" + treeMap);
//        HashTable is thread Safe
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("browser", "chrome");
        hashtable.put("url", "https://google.com");
        hashtable.put("uname", "admin");
        hashtable.put("pwd", "admin");
//        hashtable.put(null, "Hello"); it don't allow to store data key as null
//        hashtable.put("key", null);   it don't allow to store data value as null


        System.out.println("\nHashTable: " + hashtable);

//        System.out.println(hashMap.containsKey("urls"));
//        System.out.println(hashMap.containsValue("chrome"));
//        System.out.println(hashMap.size());
//        System.out.println(hashMap.isEmpty());
//        HashMap<String, String> newHashMap = (HashMap<String, String>) hashMap.clone();
//        HashMap<String, String> newHashMap = hashMap;
//        System.out.println(newHashMap);
//        newHashMap.put("pwd", "admin123");
//
//        System.out.println("HashMap: " + hashMap);
//        System.out.println("newHashMap: " + newHashMap);

//        System.out.println(hashMap.get("admin"));
//        System.out.println(hashMap.keySet());
//        System.out.println(hashMap.values());
//
////        System.out.println(hashMap.entrySet());
//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
////            System.out.println(entry.getKey());
////            System.out.println(entry.getValue());
////            System.out.println("key: " + entry.getKey() + " Value: " + entry.getValue());
//
//            System.out.println(hashMap.get(entry.getKey()));
//        }
    }
}
//characteristics of MAP
// it store data in key,value pair
// insertion order not maintained
// duplicate key not possible
// value can be duplicate
// value is going to override

//key,value pairs are called as Entry
//EntrySet: Collection of key,value pairs in a map.