package logic;

public class ConverseAndInverse {

	public static void main(String[] args) {
		
		System.out.println("PROPOSITION\n"
				+ "\tp -> q\n"
				+ "CONVERSE\n"
				+ "The hypothesis becomes the conclusion and the conclusion becomes the hypothesis.\n"
				+ "\tq -> q\n"
				+ "INVERSE\n"
				+ "Negate the propositions, but do not change their positions.\n"
				+ "\t~p -> ~q\n"
				+ "Example:\n"
				+ "IF it rains THEN the party is canceled.\n"
				+ "CONVERSE: IF the party is canceled THEN it rains.\n"
				+ "INVERSE: IT it NOT rains THEN the party is NOT canceled.\n"
				+ "The converse and the inverse are LOGICALLY EQUIVALENT\\n"
				+ "A conditional statement and its converse are NOT logically equivalent");
	}

}
