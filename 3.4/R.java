import java.util.*;
class R implements CalculatorR{
	
	public void add(int x, int y){
		System.out.println("Addition is - "+ (x+y));
	}
	public void sub(int x, int y){
		System.out.println("Subtraction is - "+ (x-y));
	}
	public void mul(int x, int y){
		System.out.println("Multiplication is - "+ (x*y));
	}
	public void div(int x, int y){
		System.out.println("Division is - "+ (x/y));
	}
	public void mod(int x, int y){
		System.out.println("Modulo is - "+ (x%y));
	}

}