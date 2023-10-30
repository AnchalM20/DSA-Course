package com.array;
import java.util.ArrayList;
import java.util.Collections;

public class FactorialOfLArgeNumber {
    static void multiply(ArrayList<Integer> number, int multiplier)
    {
        int carry = 0;
        for (int i = 0; i < number.size(); i++) {
            int product = number.get(i) * multiplier + carry;
            number.set(i, product % 10);
            carry = product / 10;
        }

        while (carry > 0) {
            number.add(carry % 10);
            carry /= 10;
        }
    }

    public static ArrayList<Integer> factorials(int N)
    {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 2; i <= N; i++) {
            multiply(result, i);
        }
        Collections.reverse(result);
        return result;
    }


    public static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        int carry = 0;
        for (int i = 2; i <= N; i++) {
            carry = 0;
            for (int j = 0; j < ans.size(); j++) {
                int x = ans.get(j) * i + carry;
                if (j < ans.size() - 1) {
                    ans.set(j, x % 10);
                } else {
                    ans.add(x % 10);
                }
                carry = x / 10;
            }
            while (carry > 0) {
                ans.add(carry % 10);
                carry /= 10;
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println(factorials(20));
    }
}
