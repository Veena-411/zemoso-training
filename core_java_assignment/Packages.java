package com.java.core;
import com.java.person.Person;
public class Packages {
    public static void main(String[] args) {
        Person john = new Person("John Smith", 30, "123 Main St");
        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Address: " + john.getAddress());

        john.setName("John Doe");
        john.setAge(35);
        john.setAddress("456 Oak Ave");

        john.sayHello();

    }
}
