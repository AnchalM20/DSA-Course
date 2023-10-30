package com.array.TwoDimensionArray;

public class SpiralPrintMAtrix {

    static void printSpiral(int[][] arr)
    {
        int n=arr.length;
        int col=arr[0].length;
        int startingRow=0;
        int endingRow=n-1;
        int endingCol=col-1;
        int startingCol=0;
        int totalElement=n*col;
        int count=0;
        while(count<totalElement )
        {
            //printing startingRow
                for(int i=startingCol;i<=endingCol && count<totalElement;i++)
                {
                    System.out.print(arr[startingRow][i]+" ");
                    count++;
                }
                startingRow++;

            //printing last column
                for(int i=startingRow;i<=endingRow && count<totalElement;i++)
                {
                    System.out.print(arr[i][endingCol]+" ");
                    count++;
                }
                endingCol--;

            //printing last row
                for(int i=endingCol;i>=startingCol && count<totalElement;i--)
                {
                    System.out.print(arr[endingRow][i]+" ");
                    count++;
                }
                endingRow--;

            //printing starting column
                for(int i=endingRow;i>=startingRow && count<totalElement;i--)
                {
                    System.out.print(arr[i][startingCol]+" ");
                    count++;
                }
                startingCol++;

        }
    }
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,5},{5,6,7,8},{10,20,30,40}};
        printSpiral(arr);
    }
}
