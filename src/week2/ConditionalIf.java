package week2;

import java.util.Scanner;

public class ConditionalIf {

	public static void main(String[] args) {
		
		boolean weatherNow;
		boolean isSnowing;
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Is it cold outside? Please enter true or false");
			weatherNow = scanner.nextBoolean();
			
			
			if(weatherNow)
			{
				//System.out.println("If it is cold wear coat and gloves.");
				System.out.println("Is it snowing? Please select true or false");
				isSnowing = scanner.nextBoolean();
				
				if (isSnowing)
					System.out.println("Wear a coat and gloves");
			}
			else
			{
				System.out.println("Wear shorts");
			}
		}

	}

}
