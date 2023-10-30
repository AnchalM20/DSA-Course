package com.Char_and_String;

public class FindAllPalindromeSubstring {
    static int expand(String s,int i,int j)
    {
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            count++;
            i--;
            j++;
        }
        return count;
    }
    public static int countSubstrings(String s) {
        int totalCount=0;

        for(int centre=0;centre<s.length();centre++)
        {
            //odd count
            int oddCount=expand(s,centre,centre);

            //Even count
            int evenCount=expand(s,centre,centre+1);

            totalCount=totalCount+oddCount+evenCount;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        String s ="madam"; //Palindrome substring: "m","a","d","a","m","ada","madam" =7
        System.out.println("total: "+countSubstrings(s));
    }
}

