package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftByK {

    static void shiftByK(int arr[],int k)
    {
       int[] temp = new int[k];
       int n= arr.length;
       if(n>k){
           System.arraycopy(arr,arr.length-k,temp,0,k);
           System.arraycopy(arr,0,arr,k,n-k);

           System.arraycopy(temp,0,arr,0,k);
       }
        for(int num:arr)
            System.out.print(num+" ");

        System.out.println();
        for(int num:temp)
            System.out.print(num+" ");

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] temp = new int[arr.length];
        //System.arraycopy(arr,4,temp,4,3);
        shiftByK(arr,3);


    }
}
