package Assignment;

class FirstThread extends Thread 
{
	@Override
	public void run ()
	{
		for ( int i = 0; i <= 5; i++)
		{
			try 
			{
			   System.out.println();
			   System.out.println(i+ " by runnable " ) ;
			   Thread.sleep(3000);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class ExtendThread 
{

	public static void main ( String[] args) 
	{
       Thread thread = new Thread ();
       System.out.println(Thread.currentThread());
       thread.setName("Thread1");
       
       System.out.println("Thread1");
       System.out.println();
      
       for ( int i = 0 ; i <= 5 ;i++)
       {
    	  System.out.println("Thread1");
       try 
       {
	      Thread.sleep(3000);	
	   } 
       catch (Exception e) 
       {
		 e.printStackTrace();
	   }
       }
       FirstThread firstthread = new FirstThread ();
       firstthread.run();
	}
   }
