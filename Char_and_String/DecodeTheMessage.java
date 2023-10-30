package com.Char_and_String;

import java.util.Arrays;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String ans="";
        char start='a';
        char[] mapping = new char[380];
        Arrays.fill(mapping, '0');
        for(int i=0;i<key.length();i++)
        {
            char currentchar=key.charAt(i);
            if(currentchar!=' ' && mapping[currentchar]=='0')
            {
                mapping[currentchar]=start;
                start++;
            }
        }

        //use mapping
        for(int i=0;i<message.length();i++)
        {
            if(key.charAt(i)==' ')
            {
                ans+=' ';
            }
            else
            {
                char decodedChar = mapping[message.charAt(i)];
                ans+=decodedChar;
                //System.out.println(ans);
            }
        }
        System.out.println(ans);

    }
}
