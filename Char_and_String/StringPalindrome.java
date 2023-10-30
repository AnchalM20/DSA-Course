package com.Char_and_String;

public class StringPalindrome {

    static boolean checkPalindrome(String s)
    {
        s.toLowerCase();
        int start=0;
        int end=s.length()-1;
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

    // 'a'-->97 and 'A'=65 and the difference is 97-65=32
    //Converting to LowerCase
    static String convertToLowerCase(String s)
    {
        String ans="";
      for(int i=0;i<s.length();i++)
      {
          char ch = s.charAt(i);
          //Check If char is uppercase
          if (ch >= 'A' && ch <= 'Z') {
              ch = (char)(ch + 32);
              ans+=ch;
          }
          else  //if lowercase add as it is
              ans+=ch;
      }
      return ans;
    }

    static String convertToUpperCase(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            //Check If char is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
                ans+=ch;
            }
            else  //if lowercase add as it is
                ans+=ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str  = "SkaLakanak";
        //System.out.println("Check palindrome: "+checkPalindrome(str));
        String ans = convertToLowerCase(str);
        System.out.println("Converted to LowerCase: "+ans);
        ans = convertToUpperCase(str);
        System.out.println("Converted to UpperCase: "+ans);
    }
}
