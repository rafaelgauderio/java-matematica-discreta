package logic;

public class NegationConditional {

	public static void main(String[] args) {
		
		System.out.println("\tNegation of Conditional Statements\n"
				+ "Logically Equivalent\n"
				+ "p -> q = ~(p -> q) = ~p v q = p ^ ~q\n"				
				+ "operador OR, nega a primeira e mantém a segunda.\n"
				+ "operador AND, mantém a primeira e nega a segunda.\n"
				+ "Example:\n"
				+ "IF my father it at home THEN he can NOT pick me up.\n"
				+ "conective OR, negate the first proposition and manintain the second proposition.\n"
				+ "conective AND, manintain the first proposition and negate the second proposition.\n"
				+ "My dad is at home AND he can pick me up.\n"
				+ "My dad is NOT at home OR he can pick me up\n."
				+ "CONTRAPOSITIVE\n"
				+ "p -> q = ~q -> ~p\n"
				+ "negate both and change the order of the propositions.\n"
				+ "If today is monday then today is christmas.\n"
				+ "CONTRAPOSITIVE: if today is NOT christmas then today is NOT monday.\n"
				+ "");

	}

}
