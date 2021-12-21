import java.util.*;
class Main{
	public static void main(String[] args){
		
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Bank");
		while(i!=0){

			System.out.println("Do You Have An Account -- Y/N");
			char ch = sc.next().charAt(0);
			if(ch == 'Y'){
				System.out.println("You want to update");
				Account obj = new Account();
				obj.update();
				System.out.println("Tahnk You For Coming");
			}
			else if(ch == 'N'){

				System.out.println("Welcome To Create Your Account");
				Account obj = new Account();
				obj.create();
				System.out.println("Enter Your Name -- ");
				String name = sc.next();
				System.out.println("Enter Your PAN Number -- ");
				int pan = sc.nextInt();
				System.out.println("Enter Your Address -- ");
				String address = sc.next();
				Account obj1 = new Account(name,pan,address);
				obj1.getDetails();
				System.out.println("Thank You For Coming");
			}
			else
				System.out.println("It's Wrong Option ---- Thank You");

			System.out.println("Do You Want To Start Or Exit -- 1/0");
			i = sc.nextInt();
		}		
	}
}