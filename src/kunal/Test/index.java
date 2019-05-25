package kunal.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class index {

	// Function to find the index of an element
	public static int findIndex(int arr[], int t) {
		int len = arr.length;

		return IntStream.range(0, len).filter(i -> t == arr[i]).findAny().orElse(-1);
	}
	
	private static int binarySearchAlogo(int[] a, int fromIdex, int toIndex, int elementToFind) {

		int low = fromIdex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[mid];
			if (elementToFind > midVal) {
				low = mid + 1;
			} else if (elementToFind < midVal) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1; // Unable To FInd
	}

	public static void main(String[] args) {
		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };
		System.out.println("Index position of 5 is: " + findIndex(my_array, 7));
		System.out.println(
				"Index position of 7 using Binary Search is: " + binarySearchAlogo(my_array, 0, my_array.length, 7));
	}

	public static int findIndex1(int arr[], int t) {

		return Arrays.binarySearch(arr, t);
	}
}
