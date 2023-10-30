package com.binarySearch;

public class BinarySearchIn2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int n=row*col; //size of matrix
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int rowIndx = mid/col;  //1D-->2D to find row Index
            int colIndx = mid%col; //1D-->2D to find column Index
            int current = matrix[rowIndx][colIndx];
            if(target==current)
            {
                return true;
            }
            else if(target>current)
            {
                //goto right
                start=mid+1;
            }
            else
            {
                //got left
                end=mid-1;
            }
        }
        return false;
    }
}
