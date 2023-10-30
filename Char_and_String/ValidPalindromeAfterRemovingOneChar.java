package com.Char_and_String;

public class ValidPalindromeAfterRemovingOneChar {
    static boolean checkPalindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                boolean a1=checkPalindrome(s,i+1,j);
                boolean a2=checkPalindrome(s,i,j-1);

                return a1||a2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="masdam";  //madam palindrome after removing 's'
        boolean ans = validPalindrome(s);
        if(ans)
            System.out.println("Valid Palindrome");
        else
            System.out.println("Invalid");
    }
}
