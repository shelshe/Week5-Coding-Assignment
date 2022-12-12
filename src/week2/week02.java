package week2;

public class week02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables
		int dblVariable;
		int intVariable = 10; //initialization
		double fltVariable = 20.50f;
		
		System.out.println("The value of inVariable is " + intVariable);
		
		//widening or upgrading
		dblVariable = intVariable;
		System.out.println("The Variable of dblVariable is " + dblVariable);
		dblVariable = (int) fltVariable;
		System.out.println("The Value of dblVariable is " + dblVariable);
		
		
		
		//narrowing is not allowed
		fltVariable = dblVariable;
		intVariable = dblVariable;
		
	}

}
