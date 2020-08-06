package kunal.Main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

// Java program to find the array
// element that appears only once 
class MaxSum {
    // Return the maximum Sum of difference
    // between consecutive elements.
    static int findSingle(int ar[], int ar_size) {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        List<Integer> list = Arrays.asList(2, 3, 5, 4, 5, 3, 4);
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");


        int countA = Collections.frequency(list, 2);
        int countB = Collections.frequency(list, 3);
        int countC = Collections.frequency(list, 5);

        System.out.println(countA);
        System.out.println(countB);
        System.out.println(countC);


        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), counting()));




    }
}
// This code is contributed by Prakriti Gupta 
