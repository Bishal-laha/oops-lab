import java.util.*;
class S implements CalculatorS{

	public void add(int x, int y){
		System.out.println("Addition is - "+ (x+y));
	}
	public void sub(int x, int y){
		System.out.println("Subtraction is - "+ (x-y));
	}
	public void expo(int x, int y){
		System.out.println("Exponential is - " + Math.pow(x,y));
	}

}