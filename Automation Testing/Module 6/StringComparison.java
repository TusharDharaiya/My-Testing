package Assignment;

public class StringComparison 
{

	public static void main(String[] args) 
	{
		String MyString = " Java " ;
        String SubString = " java " ;
	    System.out.println ( MyString.equals ( SubString ) ) ;
	    System.out.println ( MyString.equalsIgnoreCase ( SubString ) ) ;
	    System.out.println ( MyString.compareTo ( SubString ) ) ;
	    System.out.println ( MyString.compareToIgnoreCase ( SubString ) ) ;
	    System.out.println ( MyString.matches ( SubString ) ) ;
	}

}
