package kunal.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MainJPMC {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        //String line;


        long a[] = new long[2];
        String line = in.readLine(); // to read multiple integers line
        String[] strs = line.trim().split("\\s+");
        for (int i = 0; i < 2; i++) {
            a[i] = Long.parseLong(strs[i]);
        }

        long fileSize = a[0];
        long transferTime = a[1];


        // Logic added as after integer size 16, calculation go in format of 'E'
        if (strs[0].length() > 16) {

            String number = String.valueOf(fileSize * 1000 * 1.048576);

            StringBuilder result
                    = new StringBuilder();

            char[] dividend
                    = number.toCharArray();

            long carry = 0l;

            for (int i = 0; i < dividend.length; i++) {
                long x = carry * 10
                        + Character.getNumericValue(
                        dividend[i]);
                result.append(x / (transferTime*60));
                carry = x % (transferTime*60);
            }

            for (
                    int i = 0;
                    i < result.length(); i++) {
                if (
                        result.charAt(i) != '0') {
                    // Return the result
                    System.out.println(result.substring(i));
                    return ;
                }
            }
            return;
        }


        double speed = (fileSize * 1000 * 1.048576) / (transferTime * 60);
        System.out.println(Math.round(speed / 2));

    }
}


//86645095902180570
//086645095902180570
//706086645095902180570
