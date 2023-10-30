package com.Char_and_String;

public class ReverseWordsInString {
    static StringBuilder reverse(StringBuilder str)
    {
     StringBuilder rev=new StringBuilder("");
     for(int i=str.length()-1;i>=0;i--)
     {
         rev=new StringBuilder(rev.append(str.charAt(i)));
     }

     return rev;
    }
    public static void main(String[] args) {
        StringBuilder ans=new StringBuilder("");
        String s = "Let's take LeetCode contest";
        String[] words;
        StringBuilder rev=new StringBuilder();
        words=s.split(" ");
        //System.out.println(words[3]);
        for(String str:words)
        {
            rev=reverse(new StringBuilder(str));
            ans=new StringBuilder(ans.append(rev).append(" "));
        }
        System.out.println(ans.toString().trim());
    }
}
