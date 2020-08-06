package kunal.Main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class NagarroReverseString {
    public static void main(String[] args) {
        String input = "Geeks For Geeks";
        reverseString(input);
    }

    private static void reverseString(String s) {
        // convert String to character array
        // by using toCharArray
        char[] try1 = s.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }

    private static void reverseArray(String s) {
        // convert String to character array
        // by using toCharArray

        char[] abc = s.toCharArray();
        for (int i = abc.length - 1; i >= 0; i--)
            System.out.println(abc[i]);

        String h = new String(abc);
    }

    private static void findDuplicateElement(List<String> s1) {
        // convert String to character array
        // by using toCharArray

        Map<String, Long> mp = new HashMap<>();
        s1.forEach(it-> mp.merge(it, 1L, Long::sum));

        //mp.values().stream().filter(aLong -> aLong > 1);

        for (Map.Entry<String, Long> s :
                mp.entrySet()) {

            if (s.getValue()>1)
                System.out.println("Duplicate Element Found " +s.getValue() + " and count " + s.getValue());


        }

    }



}
