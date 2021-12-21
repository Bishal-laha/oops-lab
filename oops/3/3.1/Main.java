import java.util.*;
class Main{

	public static void main(String[] args){

		String str;
		char ch;
		int och;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String -- ");
		str = sc.nextLine();
		System.out.println("Enter The Character To Be Removed -- ");
		ch = sc.next().charAt(0);
		och = ch;
		if(och>=64 && och<=126){
			
			S obj = new Char();
			obj.filter(str,ch);
		}
		else if(och>=48 && och<=57){
		
			S obj = new Number();
			obj.filter(str,ch);

		}
		else{

			System.out.println("Unable Request");

		}
		
	}
}