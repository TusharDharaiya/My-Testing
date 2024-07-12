package Assignment;

import java.util.Scanner;

class Grade
{
	public void display ()
	{
		Scanner SC = new Scanner (System.in);
		System.out.println ( " Enter your marks between 1 to 100 " ) ;
		int Marks = SC.nextInt();
		
		if (Marks <= 100 && Marks >=91)
		   { 
			 System.out.println ( " your grade is AA " ) ;  
		   }
		
		else if (Marks <= 90 && Marks >=81)
		   { 
			 System.out.println ( " your grade is AB " ) ;  
		   }
		
		else if (Marks <= 80 && Marks >=71)
		   { 
			 System.out.println ( " your grade is BB " ) ;  
		   }
	   
		else if (Marks <= 70 && Marks >=61)
		   { 
			 System.out.println ( " your grade is BC " ) ;  
		   }
		
		else if (Marks <= 60 && Marks >=51)
		   { 
			 System.out.println ( " your grade is CD " ) ;  
		   }
		
		else if (Marks <= 50 && Marks >=41)
		   { 
			 System.out.println ( " your grade is DD " ) ;  
		   }
		
		else if (Marks <= 40 && Marks >=30)
		   { 
			 System.out.println ( " sorry ! you are fail " ) ;  
		   }
		
		else 
		{
		  System.out.println ( " invaid input ! please enter correct input " ) ;
		}
		SC.close();	
	}
}

public class GradeProgram 
{
	
	public static void main(String[] args) 
	{
		Grade G = new Grade ();
		G.display();
	}

}
