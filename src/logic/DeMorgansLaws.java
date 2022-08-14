package logic;

public class DeMorgansLaws {

	public static void main(String[] args) {
		System.out.println("De Morgan Laws\n"
				+ "\t~(p ^ q ) == ~p v ~q\n"
				+ "\t~(p v q) == ~p ^ ~q\n"
				+ "Example:\n"
				+ "0 < x <= 3 == x > 0 and x<=3\n"
				+ "~( x > 0 and x <=3 ==  x <=0 or x >3 ");
	}

}
