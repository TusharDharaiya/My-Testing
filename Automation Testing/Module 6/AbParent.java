package Assignment;

abstract class Parent 
{
  abstract void massage ();	
  void display ()
  {
	System.out.println("this is abstract class");
  }
}

class child1 extends Parent
{
	@Override
	public void massage()
	{
	  System.out.println("this is the first subclass");
	}
}

class child2 extends Parent
{
	public void massage ()
	{
	  System.out.println("this is the second subclass");
	}
}

public class AbParent 
{

	public static void main ( String [] args ) 
	{
	  child1 c1 = new child1();
	  child2 c2 = new child2();
	  c1.display();
	  c1.massage();
	  c2.massage();

	}

}
