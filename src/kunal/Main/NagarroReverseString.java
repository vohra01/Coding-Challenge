package kunal.Main;

class NagarroReverseString {
	public static void main(String[] args) {
		String input = "Geeks For Geeks";
		reverseString(input);
	}

	private static void reverseString(String s) {
		// convert String to character array
		// by using toCharArray
		char[] try1 = s.toCharArray();
		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
