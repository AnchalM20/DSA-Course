package com.Patterns;

public class Diamond {
    public static void main(String[] args) {
        int row=7;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<row-i;j++)
                System.out.print(" ");
            for (int k=0;k<=i;k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<6-i;j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
