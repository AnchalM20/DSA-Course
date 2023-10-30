package com.Char_and_String;
import java.util.Arrays;
import java.util.Scanner;

public class CharacterDemo {
    public static void main(String[] args) {
        char ch;
        ch='9';
        System.out.println((int)ch);  //ASCII code of character
        ch='A';
        System.out.println((int)ch);  //ASCII code of character
        //Array of Character
        char[] cha = new char[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            cha[i]=sc.next().charAt(0);
        }
        System.out.println(cha);
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize a char array
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(charArray);
        // Print the original char array
        System.out.println("Original Char Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Take user input to replace a character in the array
        System.out.print("Enter the index to replace (0-4): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter the new character: ");
        char newChar = scanner.nextLine().charAt(0);

        if (index >= 0 && index < charArray.length) {
            charArray[index] = newChar;
        } else {
            System.out.println("Invalid index.");
        }

        // Print the updated char array
        System.out.println("Updated Char Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Concatenate char array elements into a string
        String charArrayAsString = new String(charArray);
        System.out.println("Char Array as String: " + charArrayAsString);

        // Find the length of the char array
        int length = charArray.length;
        System.out.println("Length of Char Array: " + length);

        // Search for a character in the char array
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.nextLine().charAt(0);
        boolean found = false;
        for (char c : charArray) {
            if (c == searchChar) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Character found in the char array.");
        } else {
            System.out.println("Character not found in the char array.");
        }


        char[] originalArray = {'a', 'b', 'c', 'd', 'e'};
        char[] copiedArray1 = Arrays.copyOf(originalArray, originalArray.length);
        char[] copiedArray2 = Arrays.copyOfRange(originalArray, 1, 4);

        scanner.close();

    }

}

//Check Two Arrays equal or not?

//char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
//char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
//
//if (Arrays.equals(charArray1, charArray2)) {
//        System.out.println("The arrays are equal.");
//        } else {
//        System.out.println("The arrays are not equal.");
//        }
