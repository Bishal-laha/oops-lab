import java.util.*;
class Main{

	public static void main(String[] args) throws NewArithmaticException{

		try{
			
			Ran obj = new Ran();
			obj.count();
		}catch(NewArithmaticException e){
			
			System.out.println("Not Compiled As The Cause Is - " + e.getMessage());
			System.out.println("\nThe Iterated Value is - " + e.GetI());
		
		}
	
	}



}