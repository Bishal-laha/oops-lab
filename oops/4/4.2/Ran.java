import java.util.*;
class Ran{
	
	int i,s;
	Random r = new Random();
	public void count() throws NewArithmaticException{

		for(i=0;i<100;i++){
			s = r.nextInt(100);
			if(i==s)
				throw new NewArithmaticException(i,"ArithmaticException");

		}

	}
}