package logic;

public class TruthTables {

	public static void main(String[] args) {
		System.out.println("AND\n"
				+ "p q | p ^ q\n"
				+ "\nT T | T\n"
				+ "\nF T | F\n"
				+ "\nT F | F\n"
				+ "\nF F | F\n"
				+ "\nOR\n"
				+ "Just one need to be True for the compound statement to be tru\n"
				+ "OR is consider inclusive\n"
				+ "\nOR OR\n"
				+ "exclusive\n"
				+ "p q | or p or q\n"
				+ "T T = F\n"
				+ "F T = T\n"
				+ "T F = T\n"
				+ "F F = F\n"); 
		
	}

}
