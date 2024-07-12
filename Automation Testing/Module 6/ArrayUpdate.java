package Assignment;

import java.util.ArrayList;
import java.util.List;

public class ArrayUpdate 
{

	public static void main(String[] args) 
	{
		List <String> Languages = new ArrayList <> ();
		Languages.add("java");
        Languages.add("javascript");
        Languages.add("python");
        Languages.add("php");
        Languages.add("sql"); 
        System.out.println("Original list: " + Languages);
        Languages.set(4, "c++");
        System.out.println ( " New list : " + Languages) ;
	}
}
