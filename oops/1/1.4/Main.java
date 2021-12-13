import java.util.*;
class Main{
	
	public static void main(String[] args){

		int hours;		
		Car c1 = new Car(1,2);
		hours = c1.getHours();
		c1.display();
		CarParking p1 = new CarParking();
		p1.calculate(hours);
		Car c2 = new Car(2,1);
		hours = c2.getHours();
		c2.display();
		CarParking p2 = new CarParking();
		p2.calculate(hours);
		Car c3 = new Car(3,3);
		hours = c3.getHours();
		c3.display();
		CarParking p3 = new CarParking();
		p3.calculate(hours);
		System.out.println("\nTotal Number Of Cars --- "+Car.total);
		System.out.println("\nTotal Fare Of Cars --- "+CarParking.total);

	}









}