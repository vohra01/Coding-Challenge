package kunal.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStream {
public static void main(String args[]) {
  
  List<Integer> lst = Arrays.asList(1,2,3,4);
  
  List<Integer> list = lst.stream().filter(i -> i==0)
         .collect(Collectors.toList());
      
    System.out.println(list.size());
 }
}
