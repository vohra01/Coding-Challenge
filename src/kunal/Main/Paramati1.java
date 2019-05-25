package kunal.Main;

public class Paramati1 {
	public static boolean contains(int[] arr, int item) {
		int index = java.util.Arrays.binarySearch(arr, item);
		return index >= 0;
	}

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int totalElements = sc.nextInt();
		int[] numbers = new int[totalElements];

		for (int i = 0; i < totalElements; i++) {
			if (sc.hasNextInt()) {
				numbers[i] = sc.nextInt();
			}
		}
		int toFind = sc.nextInt();
		java.util.Arrays.sort(numbers);
		System.out.println(true == contains(numbers, toFind) ? "YES" : "NO");
	}

}
