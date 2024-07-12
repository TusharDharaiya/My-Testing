package Assignment;
  
public class ArmstrongNumber 
  {
	public static void main ( String [] args ) 
	{	
	  int Number = 371, OriginalNumber, remainder, result = 0 ;
	  OriginalNumber = Number ;
	  
	  while ( OriginalNumber != 0)
	  {
		  remainder = OriginalNumber % 10;
          result +=Math.pow(remainder, 3);
          OriginalNumber /= 10;
	  }
       
	  if ( result == Number)
	  {
         System.out.println ( Number + " is a Armstrong Number " ) ;		  
	  }
	  else
	  {
		 System.out.println ( Number + " is a not Armstrong Number " ) ;
	  }
	}
  }
