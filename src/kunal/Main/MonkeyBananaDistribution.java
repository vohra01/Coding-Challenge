package kunal.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
* You can select the number of people that receive bananas.
* Each person should get more than one banana.
* One person cannot receive all the bananas.
* All the N bananas must be distributed.
* Each person can only receive an integral number of bananas.
*
* SAMPLE INPUT
       2 (TestCases)
       2 (NO)
       4 (YES)
*
*/
public class MonkeyBananaDistribution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String out_;
            if (isPrime(N)) {
                out_ = "No";
            } else {
                out_ = "Yes";
            }
            wr.println(out_);
        }

        wr.close();
        br.close();
    }

    private static boolean isPrime(int n) {
        if (n < 3) return true;
        if (n % 2 == 0) return false;
        if (n > 10) {
            if (n % 3 == 0) return false;
            if (n % 4 == 0) return false;
            if (n % 5 == 0) return false;
            if (n % 6 == 0) return false;
            if (n % 7 == 0) return false;
            if (n % 8 == 0) return false;
            if (n % 9 == 0) return false;
        }
        int r = (int) Math.sqrt(n);
        for (int i = 3; i <= r; i++) {
            if (n % i == 0) return false;
        }
        return true;

    }
}
