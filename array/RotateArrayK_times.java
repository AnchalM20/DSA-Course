package com.array;

public class RotateArrayK_times {

    static void rotateMethod2(int arr[],int k)
    {
        int n=arr.length;
      int[] temp = new int[k];
      int indx=0;
      for(int i=n-k;i<n;i++)
      {
          //System.out.println(arr[i]);
          temp[indx]=arr[i];
          indx++;
      }

      for(int i=n-1;i>=k;i--)
      {
        arr[i]=arr[i-k];
          //System.out.println(arr[i]+" "+arr[i-k]);
      }
      for(int i=0;i<k;i++)
      {
          arr[i]=temp[i];
      }
        System.out.println("\nUsing Method2");
        for(int num:arr)
            System.out.print(num+" ");
    }
    //Space: O(n)
    static void rotate(int arr[],int k)
    {
        int n=arr.length;
        int[] ans = new int[n];
        for(int index=0;index<n;index++)
        {
            int newIndex = (index+k)%n;
            ans[newIndex]=arr[index];
        }
        System.out.println("Using Modulus Method");
        for(int num:ans)
            System.out.print(num+" ");
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int rotate=5;
        rotateMethod2(arr,rotate);
    }
}
