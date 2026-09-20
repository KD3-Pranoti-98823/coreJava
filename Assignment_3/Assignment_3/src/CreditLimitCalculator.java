import java.util.Scanner;
public class CreditLimitCalculator {
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Account Number :");
		int accountNumber = sc.nextInt();
		
		System.out.print("enter Beginning balance :");
		int beginningBalance = sc.nextInt();
		
		System.out.print("Total charges :");
		int charges =sc.nextInt();
		
		System.out.print("total credit :");
		int credit =sc.nextInt();
		
		System.out.print("enter credit limit : ");
		int creditLimit = sc.nextInt();
		
		int newBalance = beginningBalance + charges - credit;
		
		 System.out.println("Account Number: " + accountNumber);
	        System.out.println("New Balance: " + newBalance);
	        
	      if(newBalance>creditLimit) {
	    	  System.out.println("Credit limit exceeded ");
	    	   }else {
	    		   System.out.println("Credit limit not exceeded ");
	    		   
	    	   }
	      sc.close();
		
		}
}
