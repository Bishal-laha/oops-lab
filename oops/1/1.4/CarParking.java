import java.util.*;
class CarParking{

	int rate = 5;
        int fare;
	static int total;
	
	public void calculate(int hours){

		if(hours>=1){

			fare = hours*rate;
			System.out.println("\nFare of Parking --- "+fare);
			total += fare;
			
		}
		else{

			System.out.println("\nNo Fare");

		}
	}
	
}