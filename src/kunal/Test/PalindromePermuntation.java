package kunal.Test;
/**
 * Created by kv58935 on 11/29/2018.
 */


import java.io.*;
import java.util.*;
import java.math.*;

public class PalindromePermuntation {
        static int NO_OF_CHARS = 256;

        /* function to check whether characters
        of a string can form a palindrome */
        static boolean canFormPalindrome(String str) {

            // Create a count array and initialize all
            // values as 0
            int count[] = new int[NO_OF_CHARS];
            return checkForPalindrome(str, count, NO_OF_CHARS);
        }

        // Driver program
        public static void main(String args[])
        {
            if (canFormPalindrome("geeksforgeeks"))
                System.out.println("Yes");
            else
                System.out.println("No");

            if (canFormPalindrome("geeksogeeks"))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
