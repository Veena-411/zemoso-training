package com.java.core;

public class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread is running");
        for(int i=0;i<3;i++)
        {
            System.out.println("Iteration "+i);
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
    }

}
