package com.Char_and_String;

public class ReverseVowel {
    static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    static String reverseVowel(StringBuilder str)
    {
        int i=0;
        int j=str.length()-1;
        while (i<j)
        {
        if(isVowel(str.charAt(i))&& isVowel(str.charAt(j)))
        {
            //both are vowels swap
            char char1 = str.charAt(i);
            char char2 = str.charAt(j);
            str.setCharAt(i, char2);
            str.setCharAt(j, char1);
            i++;
            j--;
        }
        if(!isVowel(str.charAt(i)))
        {
            i++;
        }
        if (!isVowel(str.charAt(j)))
        {
            j--;
        }
        }
        String ans=str.toString();
        return ans;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("LEEtCode");
        String ans = reverseVowel(sb);
        System.out.println(ans);

    }
}
