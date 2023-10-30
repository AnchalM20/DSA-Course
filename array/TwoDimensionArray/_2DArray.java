package com.array.TwoDimensionArray;

import java.util.Scanner;

public class _2DArray {

    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5},{5,6,7,8}};
        System.out.println(arr[0].length);
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        //2D array with user input
        int[][] ar = new int[row][col];
        System.out.println(ar.length);
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        //   For-Each Loop
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Using a nested foreach loop to access elements in the 2D array
//        for (int[] r : twoDArray) {
//            for (int element : r) {
//                System.out.print(element + " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }


        //Print Matrix Diagonal sum
        int sum=0;
        for(int i=0;i<row;i++)
        {
            sum+=ar[i][i];
        }
        System.out.println("Diagonal sum: "+sum);
    }
}
