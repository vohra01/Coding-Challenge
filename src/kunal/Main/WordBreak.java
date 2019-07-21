package kunal.Main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordBreak {

    public static void main(String[] args) {
       /* HashSet<String> hs = new HashSet<String>();
        hs.add("she");
        hs.add("supported");
        hs.add("herself");
        hs.add("selling");
        hs.add("fossils");
        hs.add("problem");
        hs.add("to");
        hs.add("geologists");
        hs.add("and");
        hs.add("tourists");
        String inputMessage = "shesupportedherselfsellingfossilstogeologistsandtotourists";

        WordBreak ws = new WordBreak();

        // create another HashSet so store the sub problems result
        HashSet<String> memoization = new HashSet<String>();
        ws.findUsingDP(inputMessage, hs, memoization, "");
*/

        int[] numberArray = {1,2,3};
        findQualifiedNumbers(numberArray);

    }

    static String findQualifiedNumbers(int[] numberArray) {
        List<Integer> ith = new ArrayList();
        IntStream.of(numberArray).filter(x -> x == 1 && x == 2 && x == 3).map(a-> ith.add(a));
        StringBuffer num = new StringBuffer();


        for (Integer isMatched : numberArray) {
            char[] s = isMatched.toString().toCharArray();
            for (int i = 0; i <= s.length; i++){


                num.append(s[i]);
            if (s[i] == 1) {
                return true;
            }

            }
        }

        return "";
    }

    public boolean findUsingDP(String s, HashSet<String> dict,
                               HashSet<String> memory, String answer) {
        if (s.length() == 0) {
            System.out.println(answer);
            return true;
        } else if (memory.contains(s)) {
            return false;
        } else {

            int index = 0;
            String word = "";
            while (index < s.length()) {
                word += s.charAt(index);// add one char at a time
                // check if word already solved
                if (dict.contains(word)) {
                    if (findUsingDP(s.substring(index + 1), dict, memory,
                            answer + word + " ")) {
                        return true;
                    } else {
                        System.out.println("backtrack repeated word");
                        index++;
                    }
                } else {
                    index++;
                }
            }
            memory.add(s);// memoization for future;
            return false;
        }
    }

}