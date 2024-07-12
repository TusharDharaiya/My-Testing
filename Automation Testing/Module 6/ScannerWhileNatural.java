package Assignment;

import java.util.Scanner ;
public class ScannerWhileNatural 
{

	public static void main(String[] args) 
	{
		Scanner SC = new Scanner ( System.in ) ;
		System.out.println ( " The Natural Numbers (1-10) Are " ) ;
		int i = 1 ;
		while ( i <= 10)
		{
		  System.out.println (i) ;
		  i++ ;
		}
		SC.close();
	}
}
// Assignment 2 program : 10 natural numbers using while loop