import java.util.*;
class Account{

	String name;
	int pan;
	String address;
	private int id;

	Scanner sc = new Scanner(System.in);

	Account(){}
		
	Account(String name,int pan,String address){
		
		this.name = name;
		this.pan = pan;
		this.address = address;
	}

	public void getDetails(){

		System.out.println("Customer Name Is -- " + name);
		System.out.println("Customer PAN Num. Is -- " + pan);
		System.out.println("Customer Address Is -- " + address);

	}

	public String generateID(){
	
		Random r = new Random();
		id = r.nextInt(999999);
		return String.format("%06d",id);

	}

	public void create(){

		System.out.println("Which Type Of Account You Want To Create -- 1.Savings 2.Demat 3.HomLoan");
		int ch = sc.nextInt();
		if(ch==1)
			System.out.println("Your Savings Account Is Created Successfully With Id -- "+generateID());
		else if(ch==2)
			System.out.println("Your Demat Account Is Created Successfully With Id -- "+generateID());
		else if(ch==3)
			System.out.println("Your HomeLoan Account Is Created Successfully With Id -- "+generateID());
		else
			System.out.println("Sorry - Unable To Create Your Account");	

	}



	public void update(){

		System.out.println("Which Type Of Data You Want To Update -- 1.Name 2.PAN Number 3.Address");
		int ch = sc.nextInt();
		if(ch==1){
			System.out.println("Enter Your Name -- ");
			String name = sc.next();
			System.out.println("Your Name Is Updated Successfully  -- "+"\nYour Name is -- "+name);
		}
		
		else if(ch==2){
			System.out.println("Enter Your PAN Number -- ");
			int pan = sc.nextInt();
			System.out.println("Your PAN Number Is Updated Successfully  -- "+"\nYour PAN Number is -- "+pan);
		}
		
		else if(ch==3){
			System.out.println("Enter Your Address -- ");
			String address = sc.next();
			System.out.println("Your Address Is Updated Successfully  -- "+"\nYour Address is -- "+address);
		}
		else
			System.out.println("Sorry - Unable To Update Your Account");

		
	}
}