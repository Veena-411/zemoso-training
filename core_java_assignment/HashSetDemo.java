package com.java.core;
import java.util.HashSet;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(45);
        hs.add(78);
        hs.add(34);
        hs.add(43);
        hs.add(22);
        hs.add(78);
        hs.add(34);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(22));
        System.out.println(hs.remove(34));
        System.out.println(hs);
    }
}
