package kunal.Test;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			String i = "0 / 0";
		} catch (NumberFormatException e) {
			System.out.println("Number");
		} catch (ArithmeticException e) {
			System.out.println("Arthematic");
		} finally {
			System.out.println("Final");
		}
	}
}
