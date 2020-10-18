package kunal.Main;/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*;

class TestClass111 {
    public static void main(String args[] ) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();                 // Reading input from STDIN


        //String text = "BAONXXOLL";
        //String text = "QAWABAWONL";
        //String text = "BAOOLLNNOLOLGBAX";
        String str = "BALLOON";



        char tempinputArray[] = string.toCharArray();
        char tempOuputArray[] = str.toCharArray();

        Arrays.sort(tempinputArray);
        Arrays.sort(tempOuputArray);

        String modifiedInput = new String(tempinputArray);
        String modifiedOutput = new String(tempOuputArray);


        //AABBGLLLLNNOOOOX
        //ABLLNOO
        int count = countMatches(modifiedInput, modifiedOutput);
        System.out.println(count);


    }





    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        return text.split(str, -1).length - 1;
    }



}
