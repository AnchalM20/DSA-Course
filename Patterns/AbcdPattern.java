package com.Patterns;

import java.util.Scanner;

public class AbcdPattern {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                char p= (char) (j+'A');
                System.out.print(p);
            }

            System.out.println();;
        }
    }
}
