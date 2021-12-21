import java.util.*;
class Main{
	
	public static void main(String[] args){

		int i,x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Number Of Cars --- ");
		int n = sc.nextInt();
		for(i=1;i<=n;i++){

			System.out.printf("\nFor %d no of Car --- ",i);
			System.out.println("\nEnter CarNo. and Hours --- ");
			x = sc.nextInt();
			y = sc.nextInt();
			Car c = new Car(x,y);
			c.display();
			CarParking p = new CarParking();
			p.calculate(y);	

		}		
		System.out.println("\nTotal Number Of Cars --- "+Car.total);
		System.out.println("\nTotal Fare Of Cars --- "+CarParking.total);

	}









}