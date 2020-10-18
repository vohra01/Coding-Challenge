package kunal.Main;

import java.util.Arrays;

class MaxOvrLap {
    public static void main(String[] args) {
        int arrl1[] = {1, 2, 4, 3, 5};
        int exit1[] = {3, 7, 6, 10, 11};
        System.out.println(maxOverlapIntervalCount(arrl1, exit1));
    }

    public static int maxOverlapIntervalCount(int[] start, int[] end){
        int maxOverlap = 0;
        int currentOverlap = 0;

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0;
        int j = 0;
        int m=start.length,n=end.length;
        while(i< m && j < n){
            if(start[i] < end[j]){
                currentOverlap++;
                maxOverlap = Math.max(maxOverlap, currentOverlap);
                i++;
            }
            else{
                currentOverlap--;
                j++;
            }


        }

        //return maxOverlap;
        return currentOverlap;
    }
}
