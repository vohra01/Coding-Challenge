package kunal.Main;

import java.util.Scanner;

class Palindrome {

	static boolean checkPalindrome(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n / 2; ++i)
			if (str.charAt(i) != str.charAt(n - i - 1))
				++count;
		// If count of changes is less than or equal to 1
		return (count <= 1);
	}

	// Driver Function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			String str = sc.next();
			if (checkPalindrome(str))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}

/*
 * 
  import java.util.Scanner;

class TestClass {

	static boolean checkPalindrome(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < n / 2; ++i)
			if (str.charAt(i) != str.charAt(n - i - 1))
				++count;
		// If count of changes is less than or equal to 1
		return (count <= 1);
	}

	// Driver Function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			String str = sc.next();
			if (checkPalindrome(str))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
 * 
 * */
