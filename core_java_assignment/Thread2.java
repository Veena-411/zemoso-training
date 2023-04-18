package com.java.core;

public class Thread2 implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
        for(int i=0;i<3;i++)
            System.out.println("iteration "+i);
    }
    public static void main(String[] args) {
        Thread2 obj = new Thread2();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t2.start();
        t1.start();
        try {
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
