package week2;

public class LogicalOperators {

	public static void main(String[] args) {
		
		boolean fbLogin = true;
		boolean googLogin = false;
		boolean email = true;
		
		//it takes one false in an AND for the entire statement to be False
		
		System.out.println(fbLogin && googLogin && email);
		
		//it takes one true in an OR for the entire statement to be TRUE
		System.out.println(fbLogin || googLogin || email);
		
		//reverse value
		System.out.println(!email);

	}

}
