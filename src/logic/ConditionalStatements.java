package logic;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		System.out.println("Conditional Statements\n"
				+ "\tif...then\n"
				+ "\tif you work hard then you get paid.\n"
				+ "\tp -> q\n"
				+ "\tp = hypothesis\n"
				+ "\tq = conclusion\n"
				+ "truth table\n"
				+ "p | q | p -> q\n"
				+ "T | T | T\n"
				+ "T | F | T\n"
				+ "F | T | F\n"
				+ "F | F | T\n"
				+ "\nif the hypothesis is true and you do not get the conclusion (false), then you have a broken promisse.\n"
				+ "p -> q == ~p v q\n"
				+ "Mnemônico = Vera Fisher é Falsa\n");
		
	}

}
