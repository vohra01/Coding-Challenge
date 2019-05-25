package kunal.Test;

/* package whatever; // don't place package name! */
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String someString = "day = 24 hour";
		someString = someString.replaceAll(" ", "");
		System.out.println(someString);
		someString = someString.replaceAll("[^0-9a-zA-Z:,]+", "");
		System.out.println(someString);
		String regex = "((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))";
		System.out.println(Arrays.asList(someString.split(regex)));
	}
}