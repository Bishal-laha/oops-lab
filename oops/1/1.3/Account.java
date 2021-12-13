import java.util.*;
class Account{

	
	private int accountNum;
	public double balance = 5000;
	public String dateOfUpdation;

	Account(int accountNum){

		this.accountNum = accountNum;
	}
	

	public void update(String dateOfUpdation){

		this.dateOfUpdation = dateOfUpdation;
		System.out.println("\nYour Updation date is  - "+dateOfUpdation);

	}

	public double getBalance(){

		return balance;
	}
	
	public void setBalance(double balance){

		this.balance = balance;
		System.out.println("\nYour remaining balnce is now - "+balance);
	}
	
}