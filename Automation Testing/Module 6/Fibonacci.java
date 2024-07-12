 package Assignment;
public class Fibonacci 
  {
	public static void main ( String [] args ) 
	{
		int n = 100, FirstNumber = 0, SecondNumber = 1 ;
		
		System.out.println ( " Fibonacci Series upto " + n);
		
		while ( FirstNumber <= 100 )
		{
			System.out.print ( FirstNumber + ", ") ;
			int ThirdNumber = FirstNumber + SecondNumber ;
			FirstNumber = SecondNumber ;
			SecondNumber = ThirdNumber ;
		}
	  }
     }
  // Assignment program 6 : Fibonacci series 
  
   
	      
	       
	    
	  