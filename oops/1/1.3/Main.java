import java.util.*;
class Main{

	public static void main(String[] args){
		
		double amount,balance;
		System.out.println("Enter Amount - ");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextDouble();

		Transaction t = new Transaction(222,amount,"12/12/21");
		Account a = new Account(222);
		balance = a.getBalance();
		balance = t.withdraw(balance);


	}









}