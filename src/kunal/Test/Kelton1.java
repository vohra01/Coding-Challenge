package kunal.Test;

import java.util.List;

public class Kelton1 {

	// Returns split point. If not possible, then
	// return -1.
	static int findSplitPoint(List<Integer> arr, int n) {

		// traverse array element and compute sum
		// of whole array
		int leftSum = 0;

		for (int i = 0; i < n; i++)
			leftSum += arr.get(i);

		// again traverse array and compute right
		// sum and also check left_sum equal to
		// right sum or not
		int rightSum = 0;

		for (int i = n - 1; i >= 0; i--) {
			// add current element to right_sum
			rightSum += arr.get(i);

			// exclude current element to the left_sum
			leftSum -= arr.get(i);

			if (rightSum == leftSum)
				return i;
		}

		// if it is not possible to split array
		// into two parts.
		return -1;
	}

	// Prints two parts after finding split
	// point using findSplitPoint()
	static boolean printTwoParts(List<Integer> arr, int n) {
		int splitPoint = findSplitPoint(arr, n);

		if (splitPoint == -1 || splitPoint == n) {
			// System.out.println("Not Possible");
			return false;
		}
		for (int i = 0; i < n; i++) {
			if (splitPoint == i)
				// System.out.println();

				// System.out.print(arr.get(i) + " ");
				return true;
		}
		return false;
	}

	// Driver program
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		String resuly = "NO";
		List<Integer> arr = new ArrayList();
		List<Integer> arr1 = new ArrayList();
		// = arr;

		for (int i = 0; i < testCases; i++) {
			arr.add(sc.nextInt());
		}
		arr1.addAll(arr);
		for (int j = 0; j < arr.size(); j++) {
			arr1.remove(j);
			//n = /arr1.get(0).SIZE;//(arr.get(0));
			if (printTwoParts(arr1, arr1.size())) {
				resuly = "YES";
				break;
			} else {
				arr1.removeAll(arr);
				arr1.addAll(arr);
				resuly = "NO";
				//continue;
			}
		}
		System.out.println(resuly);
		*/
		int [] a =  {1,2,3};
		System.out.println(a[-1]);
		
	}
	// printTwoParts(arr, n);
}
