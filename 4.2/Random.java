import java.util.*;
class Ran{
	
	int i,s;
	Random r = new Random();
	public int count() throws ArithmaticException{

		for(i=0;i<100;i++){
			s = r.nextInt(100);
			if(i==r){
				throw new ArithmaticException();
				return i;
			}

		}

}
}