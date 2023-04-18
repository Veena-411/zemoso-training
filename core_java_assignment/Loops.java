package com.java.core;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int a= 12;
        while(a<20)
        {
            System.out.println("while loop "+ a);
            a = a+3;
        }
        int f= 1;
        for(int i=0;i<5;i++)
        {
            System.out.printf("iteration = %d\n",i);
            f = f*(i+1);
        }
        System.out.println(f);

        int b = -2;
        if(b>0)
        {
            System.out.println("b is positive number");
        }
        else{
            System.out.println("b is negative number");
        }

        int n1 = 2;
        int n2 = 5;
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch(choice){
            case 1:
                System.out.println("n1 + n2 = "+ n1+n2);
                break;
            case 2:
                System.out.println("n1 - n2 = "+ (n1-n2));
                break;
            case 3:
                System.out.println("n1 * n2 = "+ (n1*n2));
                break;

        }
    }
}
