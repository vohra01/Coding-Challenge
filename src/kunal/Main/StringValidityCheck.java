package kunal.Main;

import java.util.regex.Pattern;

public class StringValidityCheck {


    public static void main(String[] args) {
        String s1 = "53";
        String s2 = "53fd";
        String s3 = "uuu";


        System.out.println(findCorrectFormat(s1));
        System.out.println(findCorrectFormat(s2));
        System.out.println(findCorrectFormat(s3));
    }


    public static String findCorrectFormat(String strNum) {

        if (strNum == null) {
            return "";
        }

        return isNumeric(strNum);
    }

    public static String isNumeric(String strNum) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        if (pattern.matcher(strNum).matches()) {
            return "Valid Format";
        }

        return isAlphanuMeric(strNum);


    }

    private static String isAlphanuMeric(String s) {

        if (s.matches(".*[1-9].*")) {
            return "Its an AlphaNumeric";
        }
        return isStringOnlyAlphabet(s);
    }

    public static String isStringOnlyAlphabet(String str) {
        // By Default return here. Qk 4th Format define h hi nahi
        return "Its a String";

        /*if ((!str.equals(""))
                && (str.matches("^[a-zA-Z]*$"))) {
            return "Its a String";
        }*/

    }
}

