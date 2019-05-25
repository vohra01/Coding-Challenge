package kunal.Main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Paramati2 {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int l = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int r = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int[] res = oddNumbers(l, r);

		for (int resItr = 0; resItr < res.length; resItr++) {
			bufferedWriter.write(String.valueOf(res[resItr]));

			if (resItr != res.length - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	static int[] oddNumbers(int l, int r) {
		int[] numbers = new int[r];

		numbers[0] = l;
		int j = 0;
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0) {
				numbers[j] = i;
			}
			j++;
		}
		return numbers;
	}
}
