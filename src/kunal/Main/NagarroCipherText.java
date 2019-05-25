package kunal.Main;

import java.util.HashSet;

public class NagarroCipherText {

	public static void main(String[] args) {

		System.out.println(sumToCharsAtString("abz"));
	}

	public static String sumToCharsAtString(String word) {
		StringBuffer b = new StringBuffer();
		char[] chars = word.toCharArray();
		for (char c : chars) {
			if (c == 'z') {
				c = 'a';
				c = (char) (c + 2);
			} else if (c != ' ')
				c = (char) (c + 3);
			b.append(c);
		}
		
		HashSet<NagarroCipherText> set = new HashSet<NagarroCipherText>();
		NagarroCipherText h = new NagarroCipherText();
		NagarroCipherText h1 = new NagarroCipherText();

		// Use add() method to add elements into the Set
		set.add(h);
		set.add(h1);
		System.out.println(h.getClass());
				System.out.println(h1.getClass());
				System.out.println(h1.equals(h));
		return b.toString();
	}
}
