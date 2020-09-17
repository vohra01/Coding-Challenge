package kunal.Main;

import java.util.List;

import static java.util.Arrays.asList;

public class AmplitudeProb {
    public static void main(String[] args) {
        List<Integer> list = asList(5, 3, 6, 1, 3);
        int k = 2;
        int minimumAmplitude = findMinimumAmplitude(list, k);
        System.out.println(minimumAmplitude);
        int minimumAmplitude1 = findMinimumAmplitude(asList(8, 8, 4, 3), k);
        System.out.println(minimumAmplitude1);
        int minimumAmplitude2 = findMinimumAmplitude(asList(3, 5, 1, 3, 9, 8), 4);
        System.out.println(minimumAmplitude2);
    }

    private static int findMinimumAmplitude(List<Integer> list, int k) {

        int minRes = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int max = 0;
            int min = 100000000;
            for (int j = i + k; j < list.size(); j++) {
                if (max < list.get(j)) {
                    max = list.get(j);
                }
                if (min > list.get(j)) {
                    min = list.get(j);
                }
            }
            for (int a = 0; a < i; a++) {
                if (max < list.get(a)) {
                    max = list.get(a);
                }
                if (min > list.get(a)) {
                    min = list.get(a);
                }
            }
            int res = max - min;
            if (minRes > res) {
                minRes = res;
            }
        }
        return minRes;
    }
}
