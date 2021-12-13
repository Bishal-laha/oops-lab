import java.util.Scanner;

class LightMotorVehicle extends Vehicle{

	int mileage;

	public void acceptNumLMV(){
		super.acceptNum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Mileage - ");
		mileage = s.nextInt();
	}

	public void displayLMV(){
		super.display();
		System.out.println("Unique ID is - "+randomNumber());
		System.out.println("Mileage is - "+mileage);
	}

}