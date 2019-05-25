package kunal.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumberSystem {

	static int maximum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt(); // get the entire line after the prompt
		List<Integer> ith = new ArrayList();
		int max = 0;
		String abc = "";
		for (int i = 0; i < testCases; i++) {
			//String abc1 = sc.next();
			//System.out.println(Integer.valueOf(abc1));
			ith.add(Integer.valueOf(sc.next()));
		}
		max = Collections.max(ith);
		maximum = max + 1;
		for (int i = 0; i < testCases; i++) {

			List<Integer> series = new ArrayList(maximum + 1);
			series = printToX(series);
			System.out.println(series.get(ith.get(i)).toString().length());

		}
	}

	static public boolean onlyContainsOneTwoAndThree(int number) {
		char[] digitsFromNumber = String.valueOf(number).toCharArray(); // convert to char[] for easier manipulation.
		boolean progress = false;
		for (char digit : digitsFromNumber) {

			if (digit == '1' || digit == '2' || digit == '3') {
				progress = true;
			} else {
				progress = false;
				break;
			}
		}
		return progress;
	}

	public static List<Integer> printToX(List<Integer> series) {
		int[] array = new int[maximum + 1];
		try {
			printToArrayLimit(array, 1, series);
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		return series;
	}

	public static List<Integer> printToArrayLimit(int[] array, int index, List<Integer> series) {
		array[index] = array[index - 1] + 1;
		if (onlyContainsOneTwoAndThree(array[index])) {
			// Do Nothing
		} else {
			array[index] = array[index - 1] + 8;
			if (array[index] != 341 && !onlyContainsOneTwoAndThree(array[index])) {
				array[index] = array[index - 1] + 80;
				// series.add(array[index]);
			} else if (array[index] != 3413 && !onlyContainsOneTwoAndThree(array[index])) {
				array[index] = array[index - 1] + 778;
			} else if (array[index] != 341111 && !onlyContainsOneTwoAndThree(array[index])) {
				array[index] = array[index - 1] + 7778;
			}
		}

		series.add(array[index]);

		printToArrayLimit(array, index + 1, series);
		return series;
	}
}

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class TestClass {

	static int maximum = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt(); // get the entire line after the prompt
		List<Integer> ith = new ArrayList();
		int max = 0;
		for (int i = 0; i < testCases; i++) {
			ith.add(i,Integer.valueOf(sc.next()));
		}
		max = Collections.max(ith);
		maximum = max + 1;
		for (int i = 0; i < testCases; i++) {

			List<Integer> series = new ArrayList(maximum + 1);
			series = printToX(series);
			System.out.println(series.get(ith.get(i)).toString().length());

		}
	}

	static public boolean onlyContainsOneTwoAndThree(int number) {
		char[] digitsFromNumber = String.valueOf(number).toCharArray(); // convert to char[] for easier manipulation.
		boolean progress = false;
		for (char digit : digitsFromNumber) {

			if (digit == '1' || digit == '2' || digit == '3') {
				progress = true;
			} else {
				progress = false;
				break;
			}
		}
		return progress;
	}

	public static List<Integer> printToX(List<Integer> series) {
		int[] array = new int[maximum + 1];
		try {
			printToArrayLimit(array, 1, series);
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		return series;
	}

	public static List<Integer> printToArrayLimit(int[] array, int index, List<Integer> series) {
		array[index] = array[index - 1] + 1;
		if (onlyContainsOneTwoAndThree(array[index])) {
			// Do Nothing
		} else {
			array[index] = array[index - 1] + 8;
			if (array[index] != 341 && !onlyContainsOneTwoAndThree(array[index])) {
				array[index] = array[index - 1] + 80;
				// series.add(array[index]);
			} else if (array[index] != 3413 && !onlyContainsOneTwoAndThree(array[index])) {
				array[index] = array[index - 1] + 778;
			} else if (array[index] != 341111 && !onlyContainsOneTwoAndThree(array[index])) {
				array[index] = array[index - 1] + 7778;
			}
		}

		series.add(array[index]);

		printToArrayLimit(array, index + 1, series);
		return series;
	}

}
*/
