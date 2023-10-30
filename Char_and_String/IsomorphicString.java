package com.Char_and_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        Map<Character, Character> s1ToS2 = new HashMap<>();
        Map<Character, Character> s2ToS1 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char charS1 = s1.charAt(i);
            char charS2 = s2.charAt(i);

            if (s1ToS2.containsKey(charS1)) {
                if (s1ToS2.get(charS1) != charS2) {
                    return false;
                }
            } else {
                s1ToS2.put(charS1, charS2);
            }
            if (s2ToS1.containsKey(charS2)) {
                if (s2ToS1.get(charS2) != charS1) {
                    return false;
                }
            } else {
                s2ToS1.put(charS2, charS1);
            }
        }

        return true;
    }




//    static boolean isomorphicCheck(String s1,String s2)
//    {
//        if(s1.length()!=s2.length())
//            return false;
//
//        char[] mapping = new char[480];
//        boolean[] istCharMapped = new boolean[480];
//        Arrays.fill(istCharMapped,false);
//        Arrays.fill(mapping, '0');
//
//        for(int i=0;i<s1.length();i++)
//        {
//            char currentchar=s1.charAt(i);
//            if(currentchar!=' ' && mapping[currentchar]=='0' && istCharMapped[s2.charAt(i)]==false)
//            {
//                mapping[currentchar]=s2.charAt(i);
//                istCharMapped[s2.charAt(i)]=true;
//            }
//
//        }
//
//        for(int i=0;i<s1.length();i++)
//        {
//            if(mapping[s1.charAt(i)]!=s2.charAt(i))
//                return false;
//        }
//        return true;
//
//    }
    public static void main(String[] args) {
        String s1="rsst";
        String s2="pwwq";
        System.out.println(isIsomorphic(s1,s2));

    }
}


