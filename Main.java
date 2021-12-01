import java.util.*;
class Main{

	public static void main(String[] args){
		System.out.println("Enter The Character - \n");
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		if(c=='A'){
		
			A obj = new A();
			obj.add(4,5);
			obj.sub(5,1);
		}
		else if(c=='S'){

			S obj = new S();
			obj.add(1,7);
			obj.sub(9,3);
			obj.expo(2,3);
		}
		else{

			Other obj = new Other();
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