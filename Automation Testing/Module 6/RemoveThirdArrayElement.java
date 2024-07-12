package Assignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdArrayElement 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		List list = new ArrayList ();
		list.add(1);
        list.add(123);
        list.add(1234);
        list.add(123456l);
        list.add(10.20f);
        list.add(10.234d);
        list.add("True");
        list.add('j');
        System.out.println(list);
	    list.remove(3); // Removing third Element from ArrayList
	    System.out.println(list);
	}

}
