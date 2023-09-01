package com.Problems;

public class FlyToDestination {
    static int minJumps(int arr[])
        {
            if (arr.length <= 1)
                return 0;

            //If value of first index guarantees
            //only 1 jump is needed, return 1
            if (arr[0] >= arr.length-1)
                return 1;

            // Return -1 if not possible to jump
            if (arr[0] == 0)
                return -1;

            // initialization
            int maxReach = arr[0];
            int step = arr[0];
            int jump = 1;

            // Start traversing array
            for (int i = 1; i < arr.length; i++) {
                // Check if we have reached the end of the array
                if (i == arr.length - 1)
                    return jump;
                //Check if value at current index guarantees jump to end
                if (arr[i] >= (arr.length-1) - i)
                    return jump + 1;

                // updating maxReach
                maxReach = Math.max(maxReach, i + arr[i]);

                // we use a step to get to the current index
                step--;

                // If no further steps left
                if (step == 0) {
                    // we must have used a jump
                    jump++;
                if (i >= maxReach)
                            return -1;
                    step = maxReach - i;
                }
            }

            return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,6,3,4,5,0,0,0,6};
        System.out.println(minJumps(arr)+1);
    }
}
