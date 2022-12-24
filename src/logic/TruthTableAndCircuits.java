package logic;

public class TruthTableAndCircuits {
	
	public static void main (String [] args) {
		
		System.out.println("\nHow to turn a truth table into a circuit."
				+ "\nUsing only logical connective."
				+ "\nFirst thing is to identify all those outputs that are one."
				+ "\nSecond step is to create a logical expression that will give you one such site that give yout true."
				+ "\n\tinput T F F, output T. It´s necessary to negate q and r."
				+ "\n\tp ^ ~q ^ ~r == T ^ T ^ T = T"
				+ "\n\tAfter using AND, thEN join the expression with OR connective"
				+ "\n\t(p ^ ~q ^ ~r) || (p ^ ~q ^ r) || (p ^ q ^ r)");
	}

}
