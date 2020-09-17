package kunal.Main;

import sun.plugin.javascript.navig4.Link;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class SnapDeal {

//    {1,1,1,2,2,3,3,3,4}
//    {1}
//    int k = 3;
    //K most frequent element


//    Sort everything;
//    Have map of int as Key and  int// GroupBy
//    for loop over keys till k


    public static void main(String[] args) {


        int[] inputArray = {1, 1, 1, 2, 2, 3, 3, 3, 4};
        int[] op= printKMostValues(inputArray, 2);

        Arrays.stream(op).forEach(System.out::println);

    }


    static int[] printKMostValues(int[] array, int k) {

        Map<Integer, Integer> abc = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer a = abc.get(array[i]);
            abc.put(array[i], (a == null) ? 1 : a + 1);
        }

        LinkedHashMap<Integer, Integer> xyz = abc.entrySet().stream().sorted(Entry.comparingByValue()).collect(toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int[] opArray = new int[k];


        for (int i = 0; i < k; i++) {
            opArray[i] =
                    xyz.get(array[i]);
        }

        return opArray;
    }
}
