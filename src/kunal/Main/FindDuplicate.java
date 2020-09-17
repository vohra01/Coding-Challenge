package kunal.Main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by kv58935 on 12/8/2018.
 */
class RepeatElement
{
    public void findDupicateInArray(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
                System.out.println(a[j]);
            count = 0;
        }
    }

    public static void main(String[] args)
    {
        RepeatElement repeat = new RepeatElement();
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Set<Integer> uniqueElements = new HashSet<>();

        int arr_size = arr.length;
        repeat.findDupicateInArray(arr);

        Set<Integer>  duplicateElements = Arrays.stream(arr)
                .filter(i-> !uniqueElements.add(i))
                .boxed().collect(Collectors.toSet());
        System.out.println(duplicateElements);

//        duplicateElements.clear();
//           Arrays.stream(arr).filter(i -> Collections.frequency(Arrays.asList(arr), i) > 1)
                //.collect(Collectors.toSet());
        System.out.println(duplicateElements);


        IntStream.of(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(it-> it.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).forEach(System.out::println);


    }
}

