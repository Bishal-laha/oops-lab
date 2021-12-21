import java.util.Scanner;

class HeavyMotorVehicle extends Vehicle{

	double capacityintons;

	public void acceptNumHMV(){
		super.acceptNum();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Capacity-in-tons - ");
		capacityintons = s.nextDouble();
	}

	public void displayHMV(){
		super.display();
		System.out.println("Unique ID is - "+randomNumber());
		System.out.println("Capacity-in-tons is - "+capacityintons);
	}

}