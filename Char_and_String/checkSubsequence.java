package com.Char_and_String;


import java.util.ArrayList;

public class checkSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        if(tlen<slen)
        {
            return false;
        }
        int sindx=0;
        for(int i=0;i<tlen;i++)
        {
            if(sindx<slen && t.charAt(i)==s.charAt(sindx))
            {
                sindx++;
            }
        }
        if(sindx==slen)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "ahbkc";
        String t="abc";
        System.out.println(isSubsequence(t,s));
    }
}
