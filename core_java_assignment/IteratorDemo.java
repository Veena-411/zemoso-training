package com.java.core;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        Iterator<Integer> it = array.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());
        while(it.hasNext()){
            int num = it.next();
            if(num<3)
            {
                System.out.println(num);
                it.remove();
            }
        }
        System.out.println(array);

    }
}
