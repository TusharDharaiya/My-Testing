package Assignment;

public class ArrayAverageValue 
{
   public static void main(String[] args) 
{
	int Age [] = { 30,27,26,45,50 } ;
	
	float Average, sum = 0 ;
	
	int length = Age.length;
	
	for (int age :Age)
	{
		sum = sum + age ;
	}
	 Average = sum / length ;
	 System.out.println ( " Average value is : " + Average ) ;
}
}
