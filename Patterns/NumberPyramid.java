package com.Patterns;
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            //spaces
            for (int j = 0; j < n - 1 - i; j++)
            {
                System.out.print(" ");
            }

            //numbers
            for(int j=0;j<i+1;j++)
                System.out.print(j+1+i);

            //reverse
            int start = i*2;
            for(int j=1;j<=i;j++)
            {
                System.out.print(start);
                start=start-1;
            }

            System.out.println();
        }

    }
}
