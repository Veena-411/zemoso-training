package com.java.core;

public class Arrays {
    public static void main(String[] args) {
        int numArray[] = new int[4];
        System.out.println(numArray[0]);
        numArray[0] = 9;
        numArray[1] = 5;
        numArray[2] = 6;
        numArray[3] = 7;
        for (int num:numArray) {
            System.out.println(num);
        }
        System.out.println();
        int[] array = {3,5,7,9,11,13};
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        System.out.println();
        int sum = 0;
        for(int num: array)
        {
            sum+=num;
        }
        System.out.println(sum);
        System.out.println();
        int arr[][] = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                arr[i][j] = i+j;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

    }
}
