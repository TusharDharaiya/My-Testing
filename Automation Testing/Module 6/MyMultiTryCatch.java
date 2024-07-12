package Assignment;


import java.util.InputMismatchException;
import java.util.Scanner ;
class Division
{
	public void Divide ()
	{
		Scanner scanner = new Scanner (System.in);
		System.out.print ( " Enter First Number : " ) ;
		int FirstNumber = scanner.nextInt();
		System.out.print ( " Enter Second Number : " ) ;
	    int SecondNumber = scanner.nextInt();
	    int Result = FirstNumber / SecondNumber ;
	    System.out.println ( " " + Result ) ;
	    scanner.close();
	}
}

public class MyMultiTryCatch 
{

	public static void main(String[] args) 
	{
      try 
      {
		Division division = new Division ();
		division.Divide();
	  } 
      catch (ArithmeticException e) 
      {
		System.out.println("Denominator Should Not Be 0 ");
	  } 
      catch (InputMismatchException e)
      {
    	System.out.println ( " Denominator Should Be Numeric " ) ;
      }
	  }

}
