package logic;

public class BlackBoxesAndGates {

	public static void main(String[] args) {

		System.out.println("\nBLACK BOXES"
				+ "\nThink about the inputs and the outputs, but not in the set of circuits inside the black box."
				+ "\nAnalogous to a printer. You do not know what happens insedi the printer, Just know the input and the print output."
				+ "\nYou do not know what algorithms is goind inside the printer." + "\n\nGATES"
				+ "\nGates are simple circuits" + "\nType of gates: not, and, or"
				+ "\n0 = off = open = F / 1 = on = closed = T"
				+ "\n\tNOT gate: is the negation. 2 input and 1 output. 1 input gets a 0 input."
				+ "\n\tAND gate: is the AND truth table. 2 inputs and 1 output"
				+ "\n\tOR gate: is the OR truth table. 2 inputs and 1 output"
				+ "\nTOOL to construct circuits online: LOGIC.LY ");

		boolean one = true;
		boolean zero = false;

		System.out.println("\nExamples of AND gate outputs");
		System.out.println("false,false: " + andGate(false, false));
		System.out.println("true,false: " + andGate(true, false));
		System.out.println("false,true: " + andGate(false, true));
		System.out.println("true,true: " + andGate(true, true));

		System.out.println("\n\nExamples of OR gate outputs");
		System.out.println("false,false: " + orGate(false, false));
		System.out.println("true,false: " + orGate(true, false));
		System.out.println("false,true: " + orGate(false, true));
		System.out.println("true,true: " + orGate(true, true));
		
		System.out.println("\n\nExamples of NOR gate outpurs");
		System.out.println("true: " + norGate(true));
		System.out.println("false: " + norGate(false));

	}

	public static boolean andGate(boolean input1, boolean input2) {

		if (input1 == true && input2 == true) {
			return true;
		} else if (input1 == false && input2 == true) {
			return false;
		} else if (input1 == true && input2 == false) {
			return false;
		} else if (input1 == false && input2 == false) {
			return false;
		}
		return false;

	}

	public static boolean orGate(boolean input1, boolean input2) {

		if (input1 == true && input2 == true) {
			return true;
		} else if (input1 == false && input2 == true) {
			return true;
		} else if (input1 == true && input2 == false) {
			return true;
		} else if (input1 == false && input2 == false) {
			return false;
		}
		return false;

	}
	
	public static boolean norGate(boolean input1) {

		if (input1 == true) {
			return false;
		} else if (input1 == false ) {
			return true;
		} 
		return false;

	}

}
