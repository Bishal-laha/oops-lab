import java.util.*;
class Other implements CalculatorO{

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
	public void log(int x){
		System.out.println("Logarithm is - "+ Math.log(x));
	}
	public void expo(int x, int y){
		System.out.println("Exponential is - "+ Math.pow(x,y));
	}


}