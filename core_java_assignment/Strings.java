package com.java.core;

public class Strings {
    public static void main(String[] args) {
        String msg = "Hello";
        System.out.println(msg);
        String blank = " ";
        String msg2 = "World";
        System.out.println(msg+blank+msg2);
        //Note: String objects are stored in a special memory area known as the "string constant pool".
        String msg3 = "World";
        System.out.println(msg2==msg3);
        System.out.println(msg2.equals(msg3));
        String msg4 = msg2.concat("6");
        System.out.println(msg4);
        String fruit1 = new String("Apple");
        String fruit2 = "Apple";
        System.out.println(fruit1==fruit2); //false
        System.out.println(fruit1.equals(fruit2)); // true
    }
}
