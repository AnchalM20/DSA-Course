package com.array;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Common_in_3SortedArray {
    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        Set<Integer> set = new LinkedHashSet<>();
        int i,j,k;
        i=j=k=0;

        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k])
            {
                set.add(A[i]);
                i++;
                j++;
                k++;

            }
            else if(A[i]<B[j])
                i++;
            else if(B[j]<C[k])
                j++;
            else
                k++;
        }
        ArrayList<Integer> arr = new ArrayList<>(set);
        return arr;
    }

    public static void main(String[] args) {
//        n1 = 6; A = {1, 5, 10, 20, 40, 80}
//        n2 = 5; B = {6, 7, 20, 80, 100}
//        n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
        int[] A= {1, 5, 10, 20, 40, 80};
        int[] B={6, 7, 20, 80, 100};
        int[] C={3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println("Common elements are: "+commonElements(A,B,C,A.length,B.length,C.length));

    }
}
