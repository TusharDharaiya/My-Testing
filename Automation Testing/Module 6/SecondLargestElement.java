package Assignment;

public class SecondLargestElement 
{
	
     	public static int findSecondLargest ( int [] arr ) 
     	{
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 
        
        for (int num : arr) 
        {
            if (num > largest) 
            {
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num != largest) 
            {
            	secondLargest = num;
            }
        }

        return secondLargest;
    }	
            
	public static void main(String[] args) 
	{
		    int[] array = {12, 35, 1, 10, 34, 1};
	        int secondLargest = findSecondLargest(array);

	        if (secondLargest != Integer.MIN_VALUE) 
	        {
	            System.out.println("Second largest element: " + secondLargest);
	        } 
	        else 
	        {
	            System.out.println("Second largest element does not exist.");
	        }
	}

}