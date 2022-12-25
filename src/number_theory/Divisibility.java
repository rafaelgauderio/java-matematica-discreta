package number_theory;

public class Divisibility {

	public static void main(String[] args) {
		
		System.out.println("Divisibility"
				+ "\n\tA integer divided by another integer you will get a integer."
				+ "\n\tD divids N, if and only if exists an integer K such that N equal D multiplied K"
				+ "\n\tExample 10 / 2 = 5. Now you multiplied 5 * 2 = 10"
				+ "\nRules"
				+ "\n\tDivisibilty by 1. All integers are divisable by 1."
				+ "\n\tDivisibilty by 2. The last digit has to be even."
				+ "\n\tDivisibilty by 3. The sum of the digits is divisible by three."
				+ "\n\tDivisibilty by 4. The last 2 digits are divisible by four."
				+ "\n\tDivisibilty by 5. The last digit has to be zero ou five."
				+ "\n\tDivisibilty by 6. Its is divisible by both 2 and 3."
				+ "\n\tDivisibilty by 7. Double the last digit and subtract it from the rest of the number. The answer is zero ou divisible by 7."
				+ "\n\t\tExample: 532 (double 2 = 4. 53 - 4 = 49. 49/7 = 7"
				+ "\n\tDivisibilty by 8. If the last three digits are divisible by 8."
				+ "\n\tDivisibilty by 9. If the sum of the digits are divisible by 9."
				+ "\n\t\tExampple: 243 = 2+4+3 = 9");

	}

}
