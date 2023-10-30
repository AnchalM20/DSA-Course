package com.Char_and_String;

public class GetShortestPath {
    static float findShortestDistance(String s)
    {
        float dist=0;
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            {
                y++;
            }
            else if (s.charAt(i)=='S')
            {
                y--;
            }
            else if (s.charAt(i)=='E')
            {
                x++;
            }
            else
            {
                x--;
            }
        }

        double sum=(x*x)+(y*y);

        dist=(float) Math.sqrt(sum);

        return dist;
    }
    public static void main(String[] args) {
      String str = "WNEEEENNWN" ;
      System.out.println("Shortest distance of given path:" +findShortestDistance(str));
    }
}
