import java.util.*;
class Number implements S{
	
	public void filter(String str,char c){
  
		String s = String.valueOf(c);

		str = str.replaceAll(s,"");
		System.out.println("The New String Is -- " + str);
	}


	

}