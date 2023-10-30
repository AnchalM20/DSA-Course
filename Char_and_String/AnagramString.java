package com.Char_and_String;

import java.util.Arrays;

public class AnagramString {

    static boolean isAnagram2(String s,String t)
    {
        int[] frequency = new int[256];
        Arrays.fill(frequency,0);
        for (int i=0;i<s.length();i++)
        {
            frequency[s.charAt(i)]++;
        }
        for (int i=0;i<t.length();i++)
        {
            frequency[t.charAt(i)]--;
        }
        for (int i=0;i<256;i++)
        {
            if(frequency[i]!=0)
                return false;
        }

        return true;
    }
    static boolean isAnagram(String s,String t)
    {
        char ch1[] = s.toCharArray();
        char ch2[] =t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        // Convert the sorted char arrays back to strings and compare
        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        String s = "anagam";
        String t = "nagaram";
        System.out.println(isAnagram2(s,t));
    }
}
