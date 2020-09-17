package kunal.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class SortUnsorted {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 1, 2, 1, 5, 3));
        //1, 3, 2, 1, 2, 1, 3

        LinkedHashMap<Integer, List<Integer>> abc = arr.stream()
                .collect(groupingBy(it -> it,
                        LinkedHashMap::new,
                        Collectors.toList()));

        System.out.println(abc);

        abc.values().forEach(System.out::println);

    }
}
