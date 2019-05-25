package kunal.Main;

import java.util.Scanner;

public class Warriors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt(); // get the entire line after the prompt

		// List<Integer> warriors = new ArrayList();
		int max = 0;

		for (int i = 0; i < testCases; i++) {
			int totalWarriors = sc.nextInt();
			int[] warriors = new int[totalWarriors];
			int war = 0;
			while (sc.hasNext()) {
				if (sc.hasNextInt())
					warriors[war] = (sc.nextInt());
				war++;
				if (war == totalWarriors)
					break;
			}
			Double power = totalPower(warriors);
			System.out.println(poisonGasEffect(power));
		}
	}

	public static Double totalPower(int[] warriors) {
		Double sum = 0.0;
		for (int i : warriors)
			if (i > 0)
				sum = sum + i;
		return sum;
	}

	public static String poisonGasEffect(Double power) {

		Double tempPower = power / 2.0;
		String expectation = "No";
		boolean again = true;
		if (tempPower.compareTo(1.0) > 0 || tempPower.compareTo(1.0) == 0) {
			if (!((power % 2) == 0 && tempPower.compareTo(1.0) == 0)) {
				return poisonGasEffect(tempPower);
			} else {
				expectation = "Yes"; // even
				again = false;
			}
		}
		return expectation;
	}
}
