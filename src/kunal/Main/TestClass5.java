package kunal.Main;/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader

import java.util.HashMap;
import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass5 {
    public static void main(String args[]) throws Exception {


        //Scanner
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();                 // Reading input from STDIN

        System.out.println(findMoves(string));
    }


    private static int findMoves(String str) {


        if (str.length() < 7) {
            return 0;
        }

        int b = 1;
        int a = 2;
        int l = 3;
        int o = 4;
        int n = 5;

        int baloonTotal = b + a + 2 * l + o * 2 + n;

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }

        }
        Integer bCount = charCountMap.get('B');
        Integer aCount = charCountMap.get('A');
        Integer lCount = charCountMap.get('L');
        Integer oCount = charCountMap.get('O');
        Integer nCount = charCountMap.get('N');

        if (bCount == 0 || aCount == 0 || lCount < 2 || oCount < 2 || nCount == 0) {
            return 0;
        }

        int afterFilterCount = bCount * b + a * aCount + lCount * l + oCount * o + nCount * n;

        if (afterFilterCount % baloonTotal == 0) {
            return afterFilterCount / baloonTotal;
        }

        return 0;


    }

}
