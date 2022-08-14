package logic;

public class TruthTables {

	public static void main(String[] args) {
		System.out.println("AND\n"
				+ "p q | p ^ q\n"
				+ "T T | T\n"
				+ "F T | F\n"
				+ "T F | F\n"
				+ "F F | F\n"
				+ "\nOR\n"
				+ "Just one need to be True for the compound statement to be true\n"
				+ "OR is consider inclusive\n"
				+ "p q | p or q\n"
				+ "T T = T\n"
				+ "T F = T\n"
				+ "F T = T\n"
				+ "F F = F\n"				
				+ "\nXOR = OR OR\n"
				+ "exclusive\n"
				+ "p q | or p or q\n"
				+ "T T = F\n"
				+ "F T = T\n"
				+ "T F = T\n"
				+ "F F = F\n"
				+ "\nNEGATION\n"
				+ "p ~p\n"
				+ "T F\n"
				+ "F T\n"
				+ "Example\n"
				+ "(p v q) ^ ~(p ^ q) = p or q but not both."); 
		
	}

}
