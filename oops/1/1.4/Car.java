import java.util.*;
class Car{

	int carNo;
	int hours;
	static int total;
	
	Car(){}

	Car(int carNo, int hours){

		this.carNo = carNo;
		this.hours = hours;
	}


	public static void display(){

		total += 1;

	}	

}