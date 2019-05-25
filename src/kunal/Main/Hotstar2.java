package kunal.Main;

import java.io.IOException;
import java.util.Scanner;

public class Hotstar2 {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			String s = sc.next().toLowerCase();
			int maxOperation = sc.nextInt();

			int maxAllowed = 0;
			for (int l = 0; l < s.length(); l++) {
				if ((s.charAt(l) == 'a') || (s.charAt(l) == 'e') || (s.charAt(l) == 'i') || (s.charAt(l) == 'o')
						|| (s.charAt(l) == 'u')) {
					// System.out.println(s.charAt(l) + 1);
					if (maxAllowed  < maxOperation) {
						maxAllowed++;
						switch (s.charAt(l)) {
						case 'a':
							s = s.replaceAll("a", "b");
							break;
						case 'e':
							s = s.replaceAll("e", "f");
							break;
						case 'i':
							s = s.replaceAll("i", "j");
							break;
						case 'o':
							s = s.replaceAll("o", "p");
							break;
						case 'u':
							s = s.replaceAll("u", "v");
							break;
						}
					}
				}
			}
			System.out.println(s);
		}
	}

}
