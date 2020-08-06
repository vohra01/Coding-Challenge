package kunal.Main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {
 
 public static void main(String args[]) {
  
  int myArray[] = { 1, 5, 8 };
  IntStream stream = Arrays.stream(myArray);
  System.out.println(stream.reduce(1, (a,b) -> a+b));
 }
}
