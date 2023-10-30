package com.Char_and_String;

public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World"); // Modifies the existing StringBuilder object
        String result = stringBuilder.toString(); // Converts it to a String
        System.out.println(result); // "Hello World"

        //Integer to string: toString()
        Integer a=10;
        System.out.println(a.toString());
        Character ch ='w';
        System.out.println(sb.append(" "+a));
        ch.toString();

        //append() function add any things at the end of the string
        System.out.println(sb.append(" "+ch));
    }
}
