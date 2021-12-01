import java.util.*;
class Main{

	public static void main(String[] args){
		System.out.println("Enter 'R' if you are Remote User or 'L' if you are Local User");
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		if(c=='R'){
		
			R obj = new R();
			obj.add(4,5);
			obj.sub(5,1);
			obj.mul(5,4);
			obj.div(36,6);
			obj.mod(5,5);
		}
		else{

			L obj = new L();
			obj.add(2,3);
			obj.sub(11,2);
			obj.mul(4,4);
			obj.div(25,5);
			obj.mod(4,3);
			obj.expo(2,3);
			obj.log(10);
		}
	
	}


}