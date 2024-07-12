package Assignment;
import java.util.Scanner ;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	   Scanner scanner = new Scanner (System.in) ;
	   System.out.print ( " \n please Enter Your Range : " ) ;
       int Number = scanner.nextInt();
       for ( int i = 2 ; i<= Number ; i++)
       {
    	   int factors = 0 ;   
    	   for ( int j = i ; j >= 1; j--)
    	   {
    		   if ( ( i % j ) == 0 )
    		   {
    			   factors++ ;
    		   }
    	   }
    	   if (factors == 2)
   	       {
    	    	  System.out.println (i+  " is prime " ) ;
    	   }
    	      
       }
       scanner.close();
	}
}
//       for ( int i = 1 ; i<= Number ; i++)  
//       {
//    	  if ( (Number % i) == 0)
//    	  {
//    		  factors++;
//    	  }
//       }
//       if (factors == 2)
//       {
//    	  System.out.println (Number +  " is prime " ) ;
//       }
//       else
//       {
//          System.out.println ( Number + " is not prime " ) ;    	   
//       }
       //scanner.close();
//	}
//} // this code checks given number is prime or not