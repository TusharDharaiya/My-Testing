package Assignment;

public class MyTryCatch 
{

	public static void main(String[] args) 
	{
     try 
     {
	   int Marks [] = { 80,90,79,84 } ;
	   System.out.println(Marks[5]);
	 } 
     catch (ArrayIndexOutOfBoundsException e) 
     {
		System.out.println("you try to Access Element out of array index");
	 }		
	}

}
