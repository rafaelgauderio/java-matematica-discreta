package logic;

public class NegationQuantifiedStatements {

	public static void main(String[] args) {
		
		System.out.println("Negation of Quantified Statements"
				+ "\n\tNegation of All is to find at list one element in the set such the role does not apply."
				+ "\n\tExample: All man are tall. the negation is It exist one man that is NOT tall."
				+ "\n\tUse EXISTENTIAL statement to negate the UNIVERSAL statement. Negate the rule."
				+ "\n\tUse the UNIVERSAL statement to negate the EXISTENTIAL statement. Negate the rule."
				+ "\n\tB = { 6/3, 2/4, 3/7}, ∀ x ∈ A, x is a rational number"
				+ "\n\tThe negation is: ∃x ∈  B such that x does NOT belongs to Rational."
				+ "\n\tEvery real number x there is a real number y for which y^3 = x"
				+ "\n\tThe negation is: ∃x ∈ R, ∀ y ∈ R, y^3 != x");

	}

}
