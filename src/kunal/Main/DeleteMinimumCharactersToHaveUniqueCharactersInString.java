package kunal.Main;

import java.util.*;

class DeleteMinimumCharactersToHaveUniqueCharactersInString {

    public static void main(String[] args) {
        //String input = "ccaaffddecee";
        //int result = Approach1(input);
        //result is 6
        String input = "aaaabbbb";
        int result = Approach1(input);
        //result is 1

        System.out.println(input);
        System.out.println(result);

        input = "ccaaffddecee";
        result = Approach1(input);
        //result is 6

        System.out.println(input);
        System.out.println(result);

        input = "example";
        result = Approach1(input);
        //result is 4

        System.out.println(input);
        System.out.println(result);//should be 4

        input = "eeee";
        result = Approach1(input);
        //result is 0

        System.out.println(input);
        System.out.println(result);//should be 4
    }


    static char[] printDistinct(String str) {
        Set<Character> origSet = new LinkedHashSet<>();
        StringBuilder concat = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (origSet.add(str.charAt(i))) {
                concat.append(str.charAt(i));
            }
        }
        return concat.toString().toCharArray();
    }


    static int Approach1(String input) {

        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            if (hMap.containsKey(input.charAt(i))) {
                int count = hMap.get(input.charAt(i));
                hMap.put(input.charAt(i), ++count);
            } else {
                hMap.put(input.charAt(i), 1);
            }
        }


        int numOfDeletion = 0;
        List<Integer> numOfChrs = new ArrayList<>();
        //array of distinct characters
        char[] distinctChrs = printDistinct(input);//input.toCharArray();

        for (char chr : distinctChrs) {
            //count the number of characters in the string
            int countChr = hMap.get(chr);
            while (countChr != 0 && numOfChrs.contains(countChr)) {
                countChr--;
                numOfDeletion++;
            }
            //add the count number in the list
            numOfChrs.add(countChr);
        }
        return numOfDeletion;
    }

}

