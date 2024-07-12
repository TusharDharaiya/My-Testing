package Assignment;

import java.util.Scanner ;
public class Pattern4 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println ( " Enter the number of rows for the Triangle ") ;
		int rows = scanner.nextInt();
		
		for ( int i = 1 ; i <= rows; i++)
		{
		  for ( int j = rows ; j >= i ; j--)
		  {
			 System.out.print(" ");
		  }
		  
		 for ( int j = 1 ; j <= i ; j++)
		 {
			System.out.print ( i + " " ) ; 
		 }
		 System.out.println();
		}
		scanner.close();
	}

}
