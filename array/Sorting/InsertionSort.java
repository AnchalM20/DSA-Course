package com.array.Sorting;
import java.util.Arrays;

//Time complexity o(n^2)
public class InsertionSort {
    public void insertionSort(int arr[],int n) {

        for (int i =1; i < n; i++) {
            int unsorted = arr[i];
            int j=i;
            while(j>0 && arr[j-1]>unsorted){
                arr[j]=arr[j-1];
                j = j-1;
            }
            arr[j]=unsorted;
        }
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[]={23,14,12,17,34,25};
        is.insertionSort(arr,arr.length);
        //System.out.println(Arrays.toString());
    }
}
