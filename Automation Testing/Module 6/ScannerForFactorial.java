package Assignment;

import java.util.Scanner ;
public class ScannerForFactorial 
{

	public static void main(String[] args) 
	{
	  Scanner SC = new Scanner ( System.in ) ;
	  System.out.println ( " Enter your number " ) ;
	  int number = SC.nextInt () ;
	  int fact = 1 ;
	  for ( int i = 1 ; i<= number ; i++)
	  {
		  fact = fact * i  ;
		  
	  }
	  System.out.println ( " factorial is : " + fact ) ;
	  SC.close();
	}
}



// Assignment program 3 : Factorial with for loop 