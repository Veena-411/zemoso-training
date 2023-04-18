package com.java.core;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(3);
        numList.add(1);
        numList.add(8);
        numList.add(2);
        numList.add(5);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);
        List<String > names = new ArrayList<>();
        names.add("Vinay");
        names.add("Ajay");
        names.add("shreya");
        names.add("Dimple");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student("John",101,23));
        al.add(new Student("Alice",106,27));
        al.add(new Student("Bob",105,21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.getName()+" "+st.getRollNo()+" "+st.getAge());
        }

    }
}
