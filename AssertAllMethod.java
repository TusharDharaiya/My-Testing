package Junit_Assignment;

import org.junit.Assert;
import org.junit.Test;

public class AssertAllMethod 
{
   @Test
   public void run1 ()
   {
	   System.out.println("run1 method is running");
   }
   
   @Test(expected = ArithmeticException.class)
   public void run2 ()
   {
	   int c = 10 / 0 ;
	   System.out.println(c);
	   System.out.println("run2 method is running");
   }
   
   @Test
   public void run3 ()
   {
	   int a [] = { 10,20,30,40 } ;
	   int b [] = { 10,20,30,40 } ;
	   
       Assert.assertArrayEquals(a, b);	
       Assert.assertTrue(true);
       
       System.out.println("run3 method is running");
	   
   }
   
   @Test
   public void run4 ()
   {
	   System.out.println("run4 method is running");
   }
}
