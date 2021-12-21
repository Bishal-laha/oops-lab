import java.util.*;
class Transaction{

	private int accountNum;
	public double amount;
	public String dateOfTransaction;


	Transaction(int accountNum, double amount, String dateOfTransaction){
	
		this.accountNum = accountNum;
		this.amount = amount;
		this.dateOfTransaction = dateOfTransaction;

	}		

	public double withdraw(double balance){

		if(amount<=balance){

			System.out.println("Your "+amount+" Balance has been deducted");
			balance -= amount;
			Account a = new Account(222);
			a.setBalance(balance);
			a.update("13/12/21");
			return balance;
		}
		else{

			System.out.println("\nSorry --- Your remaining balnce is too low");
			return balance;
		}


	}









}