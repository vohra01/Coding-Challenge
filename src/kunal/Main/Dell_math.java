package kunal.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dell_math {
	// Returns minimum number of
	// jumps to reach arr[h] from arr[l]
	static int minJumps(List<Integer> arr, int l, int h) {
		// Base case: when source destination are same
		if (h == l)
			return 0;

		// When nothing is reachable
		if (arr.get(l).equals(0))
			return Integer.MAX_VALUE;

		// Traverse through all the points
		int min = Integer.MAX_VALUE;
		
		for (int i = l + 1; i <= h && i <= l + arr.get(l); i++) {
			int jumps = minJumps(arr, i, h);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;
	}

	// Driver code
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int n = 0;
		List<Integer> arr = new ArrayList();
		for (int i = 0; i < testCases; i++) {
			int totalElements = sc.nextInt();
			for (int j = 0; j < totalElements; j++) {
				arr.add(Integer.valueOf(sc.nextInt()));
				// System.out.println(Arrays.toString(primitive));
			}
			n = arr.size();
			//primitive = arr.stream().mapToInt(Integer::intValue).toArray();
			System.out.print(minJumps(arr, 0, n - 1));
		}

		

	}
}

/*
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
	// Returns minimum number of
	// jumps to reach arr[h] from arr[l]
	static int minJumps(int arr[], int l, int h) {
		// Base case: when source destination are same
		if (h == l)
			return 0;

		// When nothing is reachable
		if (arr[l] == 0)
			return Integer.MAX_VALUE;

		// Traverse through all the points
		int min = Integer.MAX_VALUE;
		for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
			int jumps = minJumps(arr, i, h);
			if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;
	}

	// Driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int[] primitive = {}};
		int n = 0;
		List<Integer> arr = new ArrayList();
		for (int i = 0; i < testCases; i++) {
			int totalElements = sc.nextInt();
			for (int j = 0; j < totalElements; j++) {
				arr.add(Integer.valueOf(sc.nextInt()));
				// System.out.println(Arrays.toString(primitive));
			}
			n = arr.size();
			primitive = arr.stream().mapToInt(Integer::intValue).toArray();
			System.out.print(minJumps(primitive, 0, n - 1));
		}
	}
}
*/
