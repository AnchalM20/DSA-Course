package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMatrix {
    public static void main(String[] args) {
        // Create a matrix using ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Adding rows to the matrix
        matrix.add(new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }});

        matrix.add(new ArrayList<Integer>() {{
            add(4);
            add(5);
            add(6);
        }});

        matrix.add(new ArrayList<Integer>() {{
            add(7);
            add(8);
            add(9);
        }});

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        //reverse each row
        for (ArrayList<Integer> row : matrix) {
            Collections.reverse(row);
        }

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

