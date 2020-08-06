package kunal.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



class Result {

    /*
     * Complete the 'selectStock' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER saving
     *  2. INTEGER_ARRAY currentValue
     *  3. INTEGER_ARRAY futureValue
     */

    public static int selectStock(int saving, List<Integer> currentValue, List<Integer> futureValue) {
        // Write your code here

        int curentValueSum = 0;
        for (int i = 0; i < currentValue.size(); i++) {
            curentValueSum += currentValue.get(i);
        }

        int futureValueSum = 0;
        for (int i = 0; i < futureValue.size(); i++) {
            futureValueSum += futureValue.get(i);
        }

        if (curentValueSum>= futureValueSum){
            return 0;
        }

        if (curentValueSum <= saving){
            return futureValueSum-curentValueSum;
        }

        List<Integer> op = new ArrayList<>();

        int maxsum = 0, a = 0, b = 0,c = 0, d = 0;

        // Find the required pair
        for (int i = 0; i < currentValue.size(); i++)
        {
            for (int j = i + 1; j < currentValue.size(); j++)
            {
                if (currentValue.get(i) + currentValue.get(j) < saving &&
                        currentValue.get(i) + currentValue.get(j) > maxsum)
                {
                    maxsum = currentValue.get(i) + currentValue.get(j);

                    op.add(i);
               }
            }
        }

        for (int i : op){
            a+= futureValue.get(i) - currentValue.get(i);
        }

        return a;
    }

}

public class PRINCIPAL {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Savings");
        int saving = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Current Value COunt");
        int currentValueCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> currentValue = new ArrayList<>();

        for (int i = 0; i < currentValueCount; i++) {
        System.out.println("Enter Current Stock" + i + "location out of " + currentValueCount);
            int currentValueItem = Integer.parseInt(bufferedReader.readLine().trim());
            currentValue.add(currentValueItem);
        }

        System.out.println("Future Value COunt");
        int futureValueCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> futureValue = new ArrayList<>();

        for (int i = 0; i < futureValueCount; i++) {
        System.out.println("Enter Future Stock" + i + "location out of " + currentValueCount);
            int futureValueItem = Integer.parseInt(bufferedReader.readLine().trim());
            futureValue.add(futureValueItem);
        }

        int result = Result.selectStock(saving, currentValue, futureValue);

    }
}
