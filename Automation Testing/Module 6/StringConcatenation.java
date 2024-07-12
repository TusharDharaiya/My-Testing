package Assignment;

public class StringConcatenation 
{

	public static void main(String[] args) 
	{
		String ProgrammingLanguage = " Java " ;
        String Technology = " + Selenium = Automation Testing " ;
        System.out.println ( ProgrammingLanguage ) ;
        System.out.println ( Technology ) ;
        System.out.println ( ProgrammingLanguage.concat(Technology) ) ;
        String NewString = ProgrammingLanguage.concat(Technology);
	    System.out.println ( NewString ) ;
	}

}
