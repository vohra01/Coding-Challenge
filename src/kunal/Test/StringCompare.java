package kunal.Test;

public class StringCompare {

	public static void main(String[] args) {
		String a = "Kunal";
		String b = "Kunal";
		String c = a;
		c = "Kunal";
		Integer f =0;
		if (c == b) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}
}
