package week2;

public class EvenNumbers {

	public static void main(String[] args) {

		int i, upperLimit = 50;
		
		System.out.println("Numbers are: ");
		//pre test loop - when you know how many times to iterate
		for(i = 1; i <= upperLimit; i++)
		{
			System.out.println(i + " ");
		}

		// Escape character, \n new line, \t tab
		System.out.println("\nNumber 5 interval: ");
		for (i = 1; i <= upperLimit; i++)
		{
			if (i % 5 == 0 ) //module, mod, remainder of division
				System.out.println(i + " ");
		}
	}

}
