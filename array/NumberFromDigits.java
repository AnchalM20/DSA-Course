package com.array;

import java.util.Scanner;

public class NumberFromDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits: ");
        int numDigits = scanner.nextInt();

        if (numDigits < 0) {
            System.out.println("Please enter a valid number of digits.");
            return;
        }

        int number = 0;

        for (int i = 0; i<numDigits; i++) {
            System.out.print("Enter digit " + (i+1) + ": ");
            int digit = scanner.nextInt();
            number = number+digit*(int)Math.pow(10,numDigits-i-1);
        }
        System.out.println("The calculated number is: " + number);

    }
}
