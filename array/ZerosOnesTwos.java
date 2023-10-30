package com.array;

import java.util.Scanner;

public class ZerosOnesTwos {
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,mid,low);
                mid++;low++;
            }
            else if (arr[mid]==2) {
                swap(arr,high,mid);
                high--;
                //index++ no need becoz we don't know which element is at mid after swapping with right
            }
            else {
                mid++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
