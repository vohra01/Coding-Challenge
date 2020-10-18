package kunal.Main;


import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

import static java.lang.Math.max;
import static java.lang.Math.min;

class FindIntersactionPoint1 {

    private static void findIntersection(int[][] intervals) {

        AtomicReference<Integer> left = new AtomicReference<>();
        AtomicReference<Integer> right = new AtomicReference<>();
        AtomicBoolean aBoolean = new AtomicBoolean(true);

        left.getAndSet(intervals[0][0]);
        right.getAndSet(intervals[0][1]);


        Stream.iterate(1, n -> n + 1)
                .limit(intervals.length - 1)
                .forEach(i -> {
                    if (aBoolean.get() && (intervals[i][0] > right.get() || intervals[i][1] < left.get())) {
                        // If no insertion across left and right
                        System.out.println(-1);
                        aBoolean.getAndSet(false);
                    }

                    if (aBoolean.get()) {
                        left.getAndSet(max(left.get(), intervals[i][0]));
                        right.getAndSet(min(right.get(), intervals[i][1]));
                    }
                });
        if (aBoolean.get()) {
            System.out.println("Possible Interaction at ::" + left.get() + "and ::" + right.get());
        }
    }

    // Driver code 
    public static void main(String[] args) {

        int[][] intervals = {{1, 6},
                {2, 8},
                {3, 10},
                {5, 8}};
        int N = intervals.length;

        int[][] intervals1 = {{1, 6},
                {8, 18}};

        int[][] intervals2 = {{1, 3},
                {2, 5}};
        int[][] intervals3 = {{1, 3},
                {4, 5}};

        int[][] intervals4 = {{1, 3},
                {2, 7},
                {4, 6},
                {3, 10},
                {5, 11}
        };

        findIntersection(intervals);
        findIntersection(intervals1);
        findIntersection(intervals2);
        findIntersection(intervals3);
        findIntersection(intervals4);
    }
}

// This Code is contributed by ajit.. 
