package com.collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfList {
    public static void main(String[] args) {
        // Create a matrix using ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Adding rows to the matrix
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        matrix.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);
        matrix.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);
        matrix.add(row3);

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Reverse the matrix
        Collections.reverse(matrix);

        // Display the reversed matrix
        System.out.println("\nReversed Matrix:");
        displayMatrix(matrix);
    }

    // Function to display a matrix
    public static void displayMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
