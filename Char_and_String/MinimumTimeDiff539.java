package com.Char_and_String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumTimeDiff539 {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        timePoints.add("23:59");
        timePoints.add("00:06");
        timePoints.add("12:34");
        timePoints.add("00:00");

            int totaTime=24*60;
            int[] times = new int[timePoints.size()];

            for(int i=0;i<timePoints.size();i++)
            {
                String str= timePoints.get(i);
                int val = Integer.parseInt(str.substring(0,2))*60+Integer.parseInt(str.substring(3));
                times[i]=val;
            }
        Arrays.sort(times);

            int min=Integer.MAX_VALUE;
            for(int i=1;i<times.length;i++)
            {
                min=Math.min(min,times[i]=times[i-1]);
                //System.out.println(min+" ");
            }
        //for first and last time difference
        int firstLastDiff=times[0]+totaTime-times[times.length-1];
        min=Math.min(min,firstLastDiff);

        System.out.println(min);
    }
}
