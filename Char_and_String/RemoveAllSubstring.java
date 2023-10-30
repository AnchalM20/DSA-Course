package com.Char_and_String;

public class RemoveAllSubstring {
    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";
//
//            int indx=s.indexOf(part);
//        System.out.println(indx);
//        s=s.replace(part,"");
//        System.out.println(s);
//        System.out.println(s.contains(part));
//        s=s.replace(part,"");
//        System.out.println(s);  "aabababa" "aba"
        //Implementation of this replaceFirst(part,"");
        while(s.contains(part)&&s.length()>=part.length())
        {
            s=s.replaceFirst(part,"");
            System.out.println(s);
        }
    }
}
