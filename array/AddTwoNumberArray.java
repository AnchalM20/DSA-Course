package com.array;

public class AddTwoNumberArray {
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    String calc_Sum(int a[], int n, int b[], int m)
    {
        // Complete the function
        String ans="";
        int i=n-1;
        int j=m-1;
        int carry=0;
        while(i>=0 && j>=0)
        {
            int x=a[i]+b[j]+carry;
            int digit=x%10;
            ans+=digit;
            carry=x/10;
            i--;
            j--;
        }

        //If Array a[] is bigger than array b[]
        while(i>=0)
        {
            int x=a[i]+0+carry;
            int digit=x%10;
            ans+=digit;
            carry=x/10;
            i--;
        }

        //if array b[] is bigger than a[]
        while(j>=0)
        {
            int x=0+b[j]+carry;
            int digit=x%10;
            ans+=digit;
            carry=x/10;
            j--;
        }

        //if carry add to last
        if(carry>0)
        {
            ans+=carry;
        }

        //remove extra zeros
        ans=ans.replaceFirst("0+$", "");

        //reverse
        String str=reverseString(ans);
        return str;
    }

}
