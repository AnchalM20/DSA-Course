package com.Char_and_String;

public class RemoveAdjacentDuplicates {

    public static String removeCharAtIndex(String str, int index) {
        if(index < 0 || index >= str.length()) {
            // Handle invalid index, e.g., by returning the original string
            return str;
        }
        return str;
    }
    public static void main(String[] args) {
        String str="abbaca";
        int index=1;
        String ans = "";
        ans+=str.charAt(0);
        while(index<str.length())
        {
                if (ans.length()>0 && ans.charAt(ans.length() - 1) == str.charAt(index)) {
                    ans = ans.substring(0, ans.length() - 1);
                }

            else
                ans+= str.charAt(index);

            index++;
        }
        System.out.println(ans);
    }
}
