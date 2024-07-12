    package Assignment;

    import java.util.Scanner ;
	public class BalanceException 
    {
    public static void main(String[] args) throws Exception 
    {
      Scanner scanner = new Scanner ( System.in ) ;
      System.out.print ( " \n Enter The Operations That You Want To Perform : " ) ;
      int Operations = scanner.nextInt();
      switch (Operations)
      {
        case 1 :
          System.out.println ( " \n You Select Withdraw Money From Your Account " ) ;
          break ;
            
        case 2 :
          System.out.println ( " \n You Select Transfer Money From Your One Account To Another Account " ) ;
          break ;
          
        case 3 :
          System.out.println ( " \n You Want To Just Check Your Balance Of Account  " ) ;
          break ;
          
        case 4 :
          System.out.println ( " \n You Want To Get Mini Statement Of Your Last Transactions Of Your Account " ) ;
          break ;
      
        default :
          System.out.println ( " \n Sorry! You Select Wrong Option " ) ;
          break ;
      }
    	  System.out.print ( " \n Please Enter your Amount Money : " ) ;
          int AmountMoney = scanner.nextInt();
	      System.out.print ( " \n Please Enter your Withdrawal Money : " ) ;
	      int WithDrawalMoney = scanner.nextInt();
	      scanner.close();
	      try 
	      {
             if ( WithDrawalMoney > AmountMoney)
             {
            	throw new Exception ( " Sorry, insufficient balance To perform this transaction. " ) ;
             }
             else
             {
            	System.out.println ( " Withdrawal Successful " ) ;
            	AmountMoney = AmountMoney - WithDrawalMoney ;
            	System.out.println ( " Remaining Balance is : " + AmountMoney ) ;
             }
		  } 
	      catch (Exception e) 
	      {
			//System.out.println("WithDrawal Amount Should Not Be Greater Than A/C Balance ");
			e.printStackTrace();
		  }
     }
    }

