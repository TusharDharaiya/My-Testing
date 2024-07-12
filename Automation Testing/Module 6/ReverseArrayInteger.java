package Assignment;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayInteger 
{
	static void reverse(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Reversed array: " + Arrays.asList(arr));
    }
	public static void main ( String [] args) 
	{
		Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);

	}

}
