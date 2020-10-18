package kunal.Main;

// Java program to implement division
// with large number 
class GFG1111 {
	public static String longDivision( 
		String number, 
		int divisor) 
	{

long abc = Long.parseLong(number);
        abc = (long) (abc* 1000 * 1.048576);

		StringBuilder result
			= new StringBuilder(); 

		char[] dividend
			= number.toCharArray(); 

		// Initially the carry 
		// would be zero 
		int carry = 0; 

		// Iterate the dividend 
		for ( 
			int i = 0; 
			i < dividend.length; i++) { 
			// Prepare the number to 
			// be divided 
			int x 
				= carry * 10
				+ Character.getNumericValue( 
						dividend[i]); 

			// Append the result with 
			// partial quotient 
			result.append(x / divisor); 

			// Prepare the carry for 
			// the next Iteration 
			carry = x % divisor; 
		} 

		// Remove any leading zeros 
		for ( 
			int i = 0; 
			i < result.length(); i++) { 
			if ( 
				result.charAt(i) != '0') { 
				// Return the result 
				return result.substring(i); 
			} 
		} 
		// Return empty string 
		// if number is empty 
		return ""; 
	} 

	// Driver code 
	public static void main( 
		String[] args) 
	{ 
		String number 
			= "16738461734167846";
		int divisor = 13*60;
		System.out.println( 
			longDivision(
                    number, divisor));
	} 
} 

// This code is contributed by Saurabh321Gupta. 
