package com.recursion;

//using Include-Exclude Pattern
public class SubSequenceString {
    static void findSubSequences(String str,String output,int index)
    {
        if(index>=str.length())
        {
            //output string me answer build ho chuki hai
            //print the answer
            System.out.println("->"+output);
            return;
        }

        char ch = str.charAt(index);
        //exclude without adding
        findSubSequences(str,output,index+1);

        //include the char
        output+=ch;
        findSubSequences(str,output,index+1);
    }
    public static void main(String[] args) {
        String str="abc";
        String output="";
        findSubSequences(str,output,0);
    }
}
