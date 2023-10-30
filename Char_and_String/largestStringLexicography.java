package com.Char_and_String;

//Here finding a string in alphabetical order which come in last
public class largestStringLexicography {
    static String findLargest(String[] str)
    {
        String result="";
        //assume first as largest
        String largest = str[0];
        for(int i=1;i<str.length;i++)
        {
            if(largest.compareTo(str[i])<0)
            {
                largest=str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String[] fruits ={"mango","banana","apple"};
        System.out.println("The largest string is: "+findLargest(fruits));

    }
}
