package Assignment;

import java.util.Scanner ;
public class ScannerFactorial 
{

	public static void main (String[] args) 
	{
		Scanner SC = new Scanner (System.in) ;
		System.out.println ( " Enter your number  " ) ;
		int number = SC.nextInt () ;
		int factorial = 0 ;
		factorial = number * (number-1)*(number-2)*(number-3)*(number-4);
		System.out.println ( " factorial of number is : " + factorial ) ;
		SC.close();
	}

}
// Assignment program 3 : Factorial program without for loop