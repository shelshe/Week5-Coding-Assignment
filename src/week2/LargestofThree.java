package week2;

import java.util.Scanner;

public class LargestofThree {

	public static void main(String[] args) {
		
		int numberOne, numberTwo, numberThree;
		
		System.out.println("Please enter three numbers");
		try (//created object of Scanner class
		Scanner scanner = new Scanner(System.in)) {
			//reading user's input and assigning them variables
			numberOne = scanner.nextInt();
			numberTwo = scanner.nextInt();
			numberThree = scanner.nextInt();
		}
		
		if(numberOne > numberTwo && numberOne > numberThree){
			System.out.println(numberOne + "is the largest of all number");
		}
		else if (numberTwo > numberThree) {
			System.out.println(numberTwo + " is the largest of all numbers");
		}
		else if (numberThree > numberOne && numberThree > numberTwo) {
			System.out.println(numberThree + "is the largest of all numbers");
		}
	}

}
