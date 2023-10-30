package com.Char_and_String;

public class ReverseOnlyLetters {
    static String reverseLetters(String s)
    {
        char[] charArr= s.toCharArray();
        int n=s.length();
        int start=0;
        int end=n-1;
        while (start<=end)
        {
            char temp=charArr[start];

            if((Character.isAlphabetic(charArr[start]) && Character.isAlphabetic(charArr[end])))
            {
                   // System.out.println("\n"+temp+" "+temp1);
                    charArr[start] = charArr[end];
                    charArr[end] = temp;
                    start++;end--;
            }
            else if(!Character.isAlphabetic(charArr[start]))
            {
                start++;
            }
            else
            {
                end--;
            }


        }
        // Convert the charArr to a string
        String ans = new String(charArr);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        String ans = reverseLetters(s);
//        System.out.println(ans);
    }
}
