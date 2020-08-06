package kunal.Main;

import java.util.Arrays;
import java.util.List;

public class Test {
 private static Integer iCount = 0;

 public static void main(String[] args) {
  List<String> lst = Arrays.asList("a", "b", "c");
    lst.stream().forEach(i-> {
   iCount++;
  });
  System.out.println(iCount);
 }

}
