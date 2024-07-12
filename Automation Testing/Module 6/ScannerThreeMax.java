
package Assignment;

import java.util.Scanner ;
public class ScannerThreeMax 
{

	public static void main(String[] args) 
	{
		Scanner SC = new Scanner ( System.in) ; 
		int FirstNumber = 0; int SecondNumber = 0; int ThirdNumber = 0 ;
		System.out.println(" Enter your first number  ");
		FirstNumber = SC.nextInt();
		System.out.println(" Enter your second number  ");
		SecondNumber = SC.nextInt();
		System.out.println ( " Enter your third number " ) ;
		ThirdNumber = SC.nextInt () ;
		if ( FirstNumber > SecondNumber)
		{
		  System.out.println ( " first number is greater " ) ;
		}
		else if ( SecondNumber > ThirdNumber)
		{
			System.out.println ( " second number is greater " ) ;
		}
		else
		{
			System.out.println ( " Third number is greater " ) ;
		}
		SC.close();
	}

}
// Assignment program 1 :  max number from three numbers