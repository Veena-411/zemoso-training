package com.java.core;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 23;
        int b = 0;
        int c=0 ;
        try{
            c = a/b;
            System.out.println("c = "+c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        int[] arr = {2,4,5,6,8,0};
        try{
            System.out.println(arr[12]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        // custom errors
        int age = 14;
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }

    }
}
