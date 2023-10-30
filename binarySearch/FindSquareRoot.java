package com.binarySearch;
import java.text.DecimalFormat;

public class FindSquareRoot {
    static int findSquareRoot(int n)
    {
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(mid*mid>n)
            {
                //goto left
                e=mid-1;
            }
            else{
                //goto right
                ans=mid;
                s=mid+1;

            }
        }
        return ans;
    }

    static double precisionSquareRoot(int n)
    {
       double sqrt = findSquareRoot(n);
       double step=0.1;
       int precision =4;
       for(int i=0;i<precision;i++)
       {
         double j=sqrt;
         while(j*j<=n)
         {
             sqrt=j;
             j+=step;
         }
         step/=10;
       }
        return sqrt;
    }

    public static void main(String[] args)
    {
        // Format the result with exactly four decimal places
        double result = precisionSquareRoot(68);
        DecimalFormat df = new DecimalFormat("#.####");
        String formattedResult = df.format(result);
        System.out.println("Exact square root: " + formattedResult);
        System.out.println("Integer closest square root: "+findSquareRoot(58));
    }
}
