package kunal.Test;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine(); // get the entire line after the prompt
		String[] numbers = input.split(" "); // split by spaces
		int p = Integer.parseInt(numbers[0]);
		int q = Integer.parseInt(numbers[1]);
		// for (int j = 0; j < p; j++) {

		String a = sc.next();
		String b = sc.next();
		Integer aRank = findRank(a);
		Integer bRank = findRank(b);
		int[] ith = new int[q]; // LIst Of ith Locations at size Q
		for (int i = 0; i < q; i++) {
			ith[i] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			b = b.substring(0, ith[i] - 1) + '1' + b.substring(ith[i]);
			System.out.println(b);
			bRank = findRank(b);
			// ith[i] = sc.nextInt();
			System.out.println("bRank"+bRank + "aRank"+ aRank);
			if (aRank < bRank) {
				
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	// }

	static int findRank(String str) {
		int len = str.length();
		int mul = fact(len);
		int rank = 1;
		int countRight;
		for (int i = 0; i < len; ++i) {
			mul /= len - i;
			countRight = findSmallerInRight(str, i, len - 1);
			rank += countRight * mul;
		}
		return rank;
	}

	static int fact(int n) {
		return n!=0?(n <= 1) ? 1 : n * fact(n - 1):0;
	}

	static int findSmallerInRight(String str, int low, int high) {
		int countRight = 0, i;
		for (i = low + 1; i <= high; ++i)
			if (str.charAt(i) < str.charAt(low))
				++countRight;
		return countRight;
	}
}


/*
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine(); // get the entire line after the prompt
		String[] numbers = input.split(" "); // split by spaces
		int p = Integer.parseInt(numbers[0]);
		int q = Integer.parseInt(numbers[1]);
		// for (int j = 0; j < p; j++) {

		String a = sc.next();
		String b = sc.next();
		Integer aRank = findRank(a);
		Integer bRank = findRank(b);
		int[] ith = new int[q]; // LIst Of ith Locations at size Q
		for (int i = 0; i < q; i++) {
			ith[i] = sc.nextInt();
		}
		for (int i = 0; i < q; i++) {
			b = b.substring(0, ith[i] - 1) + '1' + b.substring(ith[i]);
			//System.out.println(b);
			bRank = findRank(b);
			// ith[i] = sc.nextInt();
			if (aRank < bRank) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	

    }
    
    
    static int findRank(String str) {
		int len = str.length();
		int mul = fact(len);
		int rank = 1;
		int countRight;
		for (int i = 0; i < len; ++i) {
			mul /= len - i;
			countRight = findSmallerInRight(str, i, len - 1);
			rank += countRight * mul;
		}
		return rank;
	}

	static int fact(int n) {
		//return (n <= 1) ? 1 : n * fact(n - 1);
		return n!=0?(n <= 1) ? 1 : n * fact(n - 1):0;
	}

	static int findSmallerInRight(String str, int low, int high) {
		int countRight = 0, i;
		for (i = low + 1; i <= high; ++i)
			if (str.charAt(i) < str.charAt(low))
				++countRight;
		return countRight;
	}
    
}
*/