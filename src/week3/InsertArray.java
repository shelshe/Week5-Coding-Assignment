package week3;

public class InsertArray {

	public static void main(String[] args) {
		// Declare a fixed integer array of six elements
		//number if elements minus one gives you last index number
		int [] intArray = new int[6];
		//add three elements minus one gives you last index number
		for(int i = 0; i < 3; i++)
		{
			intArray[i] = (i + 1) *5;
		}
		//insert a new element at the end of the array. It is important to ensure that there us enough 
		//space in the array to insert the element
		
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println("Index " + i + " contains " + intArray[i]);
		}

	}

}
