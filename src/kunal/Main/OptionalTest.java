package kunal.Main;

import java.util.List;
import java.util.Optional;

public class OptionalTest {

 public static void main(String[] args) {
  Optional<String> opt = Optional.of(null);
  System.out.println(opt.isPresent());
  System.out.println(Optional.empty().equals(opt));

 }

}
