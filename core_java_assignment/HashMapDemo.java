package com.java.core;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Ram",56);
        hm.put("Geetha",58);
        hm.put("John",67);
        System.out.println(hm);
        System.out.println(hm.get("Geetha"));
        System.out.println(hm.containsKey("John"));
        hm.remove("Geetha");
        System.out.println(hm);
    }
}
