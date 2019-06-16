package kunal.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {

    private static Set<String> dictionary = new HashSet<>();

    public static void main(String[] args) {
        ArrayList<String> temp_dictionary = new ArrayList<String>(Arrays.asList("mobile", "ram", "sam", "father",
                "man", "mother", "icecream", "and",
                "go", "i", "like", "ice", "love", "my", "apple"));

        // array of strings to be added in dictionary set.

        for (String temp : temp_dictionary) {
            dictionary.add(temp);
        }

        ArrayList<String> outputWord = new ArrayList<>();
        // sample input cases
        wordBreak("ilikemymother");
        wordBreak("iiiiiiii");
        wordBreak("");
        wordBreak("ilikelikeimangoiii");
        wordBreak("samsungandmangolove");
        wordBreak("samsungandmangok");

    }

    private static void wordBreak(String str) {
        // last argument is prefix
        wordBreakUtil(str, str.length(), "");
    }

    // result store the current prefix with spaces
// between words
    private static void wordBreakUtil(String str, int n, String result) {
        //Process all prefixes one by one
        for (int i = 1; i <= n; i++) {
            //extract subString from 0 to i in prefix
            String prefix = str.substring(0, i);

            // if dictionary conatins this prefix, then
            // we check for remaining String. Otherwise
            // we ignore this prefix (there is no else for
            // this if) and try next
            if (dictionary.contains(prefix)) {
                // if no more elements are there, print it
                if (i == n) {
                    // add this element to previous prefix
                    result += prefix;
                    System.out.println(result); //print result
                    return;
                }
                wordBreakUtil(str.substring(i, n - i), n - i,
                        result + prefix + " ");
            }
        }      //end for
    }//end
}

