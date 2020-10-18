package kunal.Main;

import java.util.HashMap;
import java.util.Scanner;

public class TestAirtel {
    public static void main(String[] args) {
        int output = findMinMOve("BAONXXOLL");
        System.out.println(output);
        int output1 = findMinMOve("QAWABAWONL");
        System.out.println(output1);
        int output2 = findMinMOve("BAOOLLNNOLOLGBAX");
        System.out.println(output2);


        Scanner s = new Scanner(System.in);
        String string = s.nextLine();                 // Reading input from STDIN


        //String text = "BAONXXOLL";
        //String text = "QAWABAWONL";
        //String text = "BAOOLLNNOLOLGBAX";
        String str = "BALLOON";
        System.out.println("My Length is "+"BALLOON".length());


    }

    private static int findMinMOve(String str) {

        if (str.length() < 7){
            return 0;
        }

        int b = 1;
        int a = 2;
        int l = 3;
        int o = 4;
        int n = 5;

        int balloontotal = b + a + 2 * l + o * 2 + n;
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        Integer lCount = charCountMap.get('L');
        Integer bCount = charCountMap.get('B');
        Integer aCount = charCountMap.get('A');
        Integer oCount = charCountMap.get('O');
        Integer nCount = charCountMap.get('N');

        if (bCount == 0 || aCount == 0 || lCount < 2 || oCount < 2 || nCount == 0) {
            return 0;
        }

        int afterFilterCount = bCount *  b + a * aCount + lCount * l + oCount * o + nCount * n;
//        System.out.println(afterFilterCount);

        if (afterFilterCount % balloontotal == 0) {
            return afterFilterCount / balloontotal;
        }
        return 0;
    }
}
