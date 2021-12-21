import java.util.Scanner;
import java.util.Random;

class Vehicle{

	String companyname;
	double price;
	int unique;

	public String randomNumber(){
		Random rn = new Random();
		unique = rn.nextInt(999999);
		return String.format("%06d",unique);
	}

	public void acceptNum(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Company Name - ");
		companyname = s.next();
		System.out.println("Enter Price - ");
		price = s.nextDouble();
	}

	public void display(){
		System.out.println("Company is - "+companyname+", Price is - "+price);
	}

}