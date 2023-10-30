package com.Problems;

public class RotateImage {

        //Reverse Each row of the matrix after transpose
        public static void reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //To print 2D Array
        public static void print2DArray(int[][] array) {
            for (int[] row : array) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        //function to rotate matrix 90 degree
        public static void rotate(int[][] matrix) {
            //Transpose
            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }

            //Reverse Each Row
            for(int[] row:matrix)
                reverseArray(row);  //passing each row
            print2DArray(matrix);

        }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix");
        print2DArray(arr);
        System.out.println("After rotation");
        rotate(arr);
    }
  }

