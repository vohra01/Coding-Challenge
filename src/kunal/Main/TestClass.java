package kunal.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] arr_arr = br.readLine().trim().split(" ");
			int[] arr = new int[n];
			for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
				arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
			}

			int[] out_ = solve(arr);
			// wr.print(out_[0]);
			/*
			 * for (int i_out_ = 1; i_out_ < out_.length; i_out_++) { //wr.print(" " +
			 * out_[i_out_]); }
			 */
			// wr.println();
		}

		wr.close();
		br.close();
	}

	static int[] solve(int[] arr) {
		// the value at first index of array to be returned is number of pairs
		// formed and value at second index is unpaired swords.

		Arrays.sort(arr);
		int[] arr1 = new int[2];
		int count = 0;
		boolean isPairFound = false;
		boolean wentInLoop = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				isPairFound = false;
				if ((arr[i] != 0 && arr[j] != 0) && (2 * arr[i] <= (arr[j]))) {
					for (int j2 = j + 1; j2 < arr.length; j2++) {
						if (2 * arr[j] <= (arr[j2])) {
							isPairFound = true;
							break;
						}
					}

				}
				if (isPairFound) {
					continue;
				} else if(arr[i] != 0 && arr[j] != 0){

					count++;
					System.out.println("pair " + arr[i] + " " + arr[j]);
					arr[i] = 0;
					arr[j] = 0;
					break;
				}
			}
		}
		// break;

		arr1[0] = count;
		int countUnpaired = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array " + arr[i]);
			if (0 < arr[i]) {
				countUnpaired++;
			} 
		}
		
		arr1[1] = countUnpaired;
		

		System.out.println("" + arr1[0] + " bb" + arr1[1]);
		return arr1;

	}
}