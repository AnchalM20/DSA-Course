package com.Patterns;
import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0|| j==0 || j==n-1-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
