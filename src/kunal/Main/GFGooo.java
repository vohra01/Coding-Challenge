package kunal.Main;// JAVA Code For Longest increasing subarray

class GFGooo {

    // function to find the length of longest
    // increasing contiguous subarray
    public static void printLogestIncSubArr(int arr[],
                                            int n) {
        int max = 1, len = 1, maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                len++;
            else {
                if (max < len) {
                    max = len;
                    maxIndex = i - max;
                }
                len = 1;
            }
        }

        if (max < len) {
            max = len;
            maxIndex = n - max;
        }

        for (int i = maxIndex; i < max + maxIndex; i++)
            System.out.print(arr[i] + " ");
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {2,5,3,2,4,1};
        int n = arr.length;
        printLogestIncSubArr(arr, n);

    }
}

// This code is contributed by Arnav Kr. Mandal. 
