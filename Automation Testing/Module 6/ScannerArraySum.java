package Assignment;

import java.util.Scanner ;
public class ScannerArraySum 
{

	public static void main(String[] args) 
	{
       int FirstArray [] = { 70,80,90,74,80 } ;
       System.out.println ( " length of marks are : " + FirstArray.length ) ;
       for ( int index = 0 ; index < FirstArray.length ; index++)
       {
    	 System.out.println ( FirstArray[index] ) ;
       }
   
       Scanner scanner = new Scanner (System.in);
       System.out.print ( " Please Enter your Elements Here : " ) ;
       int Number = scanner.nextInt();
       int SecondArray [] = new int [Number];
       for ( int index = 0 ; index < SecondArray.length ;index++)
       {
    	  System.out.println ( " Your Elements at a ["+index+"] : " ) ;
    	  SecondArray[index] = scanner.nextInt();  
       } 
       for ( int index = 0 ; index < SecondArray.length ; index++)
       {
    	   System.out.println ( SecondArray[index] ) ;
       }
       
       int sum = 0 ;
       for ( int index = 0 ; index < SecondArray.length; index++)
       {
    	   sum = sum + SecondArray[index];
       }
       System.out.println ( " Sum Of Elements is : " + sum );
       scanner.close();
	}

}
