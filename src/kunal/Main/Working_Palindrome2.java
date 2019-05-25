package kunal.Main;

import java.util.Arrays;
import java.util.Scanner;

class Working_Palindrome2 {

    static int NO_OF_CHARS = 256;

    static boolean canFormPalindrome(String str) {

        int[] count = new int[NO_OF_CHARS];
        return checkForPalindrome(str, count, NO_OF_CHARS);
    }

    static boolean checkForPalindrome(String str, int[] count, int noOfChars) {
        Arrays.fill(count, 0);

        for (int i = 0; i < str.length(); i++)
            count[(int) (str.charAt(i))]++;

        int odd = 0;
        for (int i = 0; i < noOfChars; i++) {
            if ((count[i] & 1) == 1)
                odd++;

            if (odd > 1)
                return false;
        }
        return true;
    }

    // Driver program
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        if (canFormPalindrome(name))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
