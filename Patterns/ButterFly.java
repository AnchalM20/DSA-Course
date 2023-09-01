package com.Patterns;

import java.util.Scanner;

public class ButterFly {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<2*n;i++)
        {
            int cond = i<n?i:n+(n-i-1);
            int spaceCount = i<n?2*(n-cond-1):i-cond-1;
            for(int j=0;j<2*n;j++)
            {
              if(j<=cond)
                  System.out.print("*");
              else if (spaceCount>0) {
                  System.out.print(" ");
                  spaceCount--;
              }
              else
                  System.out.print("*");
            }
            System.out.println();
        }

    }

}
