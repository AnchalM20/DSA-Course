package com.array.TwoDimensionArray;

public class WavePrintMatrix {

    static void printWave(int[][] arr)
    {
        int row= arr.length;
        int col = arr[0].length;
        for(int i=0;i<col;i++)
        {
                for(int j=0;j< row;j++) {
                    if(i%2==0)
                    {
                        System.out.print(arr[j][i] + " ");
                    }
                    else {
                        System.out.print(arr[row-j-1][i]+" ");
                    }

                }


        }
    }
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5},{5,6,7,8},{10,20,30,40}};
        printWave(arr);

    }
}
