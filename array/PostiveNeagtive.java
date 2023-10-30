package com.array;

public class PostiveNeagtive {
//    static void swap(int[] arr,int a,int b)
//    {
//        int temp=arr[a];
//        arr[b]=arr[a];
//        arr[a]=temp;
//    }
    public static void main(String[] args) {
       int[] arr ={-10,40,-50,59,34};
       int j=0;
       for(int index=0;index<arr.length;index++)
       {
           if(arr[index]<0)
           {
                int temp=arr[index];
                arr[index]=arr[j];
                arr[j]=temp;
              j++;
           }
       }
       for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
    }
}
