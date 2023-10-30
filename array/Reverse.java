package com.array;

public class Reverse {
    static void swap(int arr[],int a,int b)
    {
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public static void main(String[] args) {
        int[] arr={12,3,4,5,66,7,10,33,45,56,60};
//        int start=0;
//        int end=arr.length-1;
//        while (start<end)
//        {
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }

        //Using For loop
        for(int left=0,right=arr.length-1;left<right;left++,right--)
        {
            swap(arr,left,right);
        }
        for(int num:arr)
            System.out.print(num+" ");
    }
}
