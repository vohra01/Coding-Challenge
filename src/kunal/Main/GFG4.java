package kunal.Main;/* Dynamic Programming solution to print Longest
Bitonic Subsequence */

import java.util.Collections;
import java.util.Vector;

class GFG4 {

    // Utility function to print Longest Bitonic
    // Subsequence
    static void print(Vector<Integer> arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr.elementAt(i) + " ");
    }

    static int printLBS(int[] arr, int n) {

        //@SuppressWarnings("unchecked")
        Vector<Integer>[] LIS = new Vector[n];

        for (int i = 0; i < n; i++)
            LIS[i] = new Vector<>();

        LIS[0].add(arr[0]);

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if ((arr[i] > arr[j]) &&
                        LIS[j].size() > LIS[i].size()) {
                    for (int k : LIS[j])
                        if (!LIS[i].contains(k))
                            LIS[i].add(k);
                }
            }
            LIS[i].add(arr[i]);
        }

        //@SuppressWarnings("unchecked")
        Vector<Integer>[] LDS = new Vector[n];

        for (int i = 0; i < n; i++)
            LDS[i] = new Vector<>();

        LDS[n - 1].add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i] &&
                        LDS[j].size() > LDS[i].size())
                    for (int k : LDS[j])
                        if (!LDS[i].contains(k))
                            LDS[i].add(k);
            }
            LDS[i].add(arr[i]);
        }

        for (int i = 0; i < n; i++)
            Collections.reverse(LDS[i]);

        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < n; i++) {

            // Find maximum value of size of
            // LIS[i] + size of LDS[i] - 1
            if (LIS[i].size() + LDS[i].size() - 1 > max) {
                max = LIS[i].size() + LDS[i].size() - 1;
                maxIndex = i;
            }
        }

        //print(LIS[maxIndex], LIS[maxIndex].size() - 1);

        //print(LDS[maxIndex], LDS[maxIndex].size());

        return LIS[maxIndex].size() - 1+ LDS[maxIndex].size();
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 4, 1};
        //int[] arr = {2, 3, 3, 2, 2, 2, 1};
        int n = arr.length;

        System.out.println(printLBS(arr, n));
    }
}

// This code is contributed by 
// sanjeev2552 
