package kunal.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
class Result {

	*/
/*
	 * Complete the 'maximumSum' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 *//*


	public static long maximumSum(List<Integer> arr) {

		int size = arr.size();// length;
		long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + arr.get(i);
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

}
*/

public class Solution1 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		// BufferedWriter bufferedWriter = new BufferedWriter(new
//		// FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> arr = new ArrayList<>();
//
//		for (int i = 0; i < arrCount; i++) {
//			int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
//			arr.add(arrItem);
//		}
//
//		long result = Result.maximumSum(arr);
//
//		System.out.println(String.valueOf(result));
//
//		bufferedReader.close();
//		// bufferedWriter.close();
//	}
}
