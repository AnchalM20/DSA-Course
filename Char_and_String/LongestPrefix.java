package com.Char_and_String;


//Example 1:
//
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""
public class LongestPrefix {
    static String longestPrefix1(String[] arr) {
        String ans="";
        int i=0;
        while(true)
        {
            char ch=0;
            for(String str:arr)
            {
                //out of bound
                if(i>=str.length())
                {
                    ch=0;
                    break;
                }

                //first time
                if(ch==0)
                {
                    ch=str.charAt(i);
                }
                else if(ch!=str.charAt(i))
                {
                    ch=0;
                    break;
                }
            }
            if(ch==0) {
                break;
            }
            ans+=ch;
            i++;
        }
        return ans;
    }


    static String longestPrefix(String[] arr)
    {
        String ans="";
        char ch='0';
        if(arr[0].equals(""))
        {
            return ans;
        }
        int minlen=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            minlen=Math.min(minlen,arr[i].length());
        }

        for(int i=0;i<minlen;i++)
        {
            ch = arr[0].charAt(i);
            System.out.println(ch);
                for (int j = 1; j < arr.length; j++) {
                    if (ch != arr[j].charAt(i))
                        return ans;
            }
            ans+=arr[0].charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] strs = {"fler","flow","flight"};
        String[] ar={"ab","a"};
        System.out.println(longestPrefix1(strs));
    }
}
