package Assignment;

class MyRunnable implements Runnable
{

	@Override
	public void run() 
	{
	  for ( int i = 1; i <= 5 ; i++)
	  {
		  try 
		  {
			System.out.println(i+ " By Runnable");
			System.out.println();
			Thread.sleep(3000);
		  } 
		  catch (Exception e) 
		  {
			e.printStackTrace();
		}
	  }		
	}
}

public class MyRunnableThread {

	public static void main(String[] args) 
	{
	  Thread thread = new Thread ();
	  System.out.println(Thread.currentThread());
	  thread.setName("Thread1");
	  System.out.println(thread);
	  System.out.println();
      for ( int i = 1 ; i <= 5 ; i++)
      {
    	  System.out.println(thread);
    	  try 
    	  {
			Thread.sleep(3000);
		  }  
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
      }
	   MyRunnable myrunnable = new MyRunnable ();
	   myrunnable.run();
	}

}
