package Assignment;

import java.util.Arrays;

public class MinMaxArray 
{

	public static void main ( String [] args ) 
	{
		 int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	     int max = myArray[0];
	     int min = myArray[0];

	     for (int i = 1; i < myArray.length; i++) 
	     {
	        if (myArray[i] > max) 
	        {
	           max = myArray[i];
	         }
	        if (myArray[i] < min) 
	        {
	           min = myArray[i];
	         }
	        }
	        System.out.println("Original Array: " + Arrays.toString(myArray));
	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	}
}
