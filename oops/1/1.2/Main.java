class Main{


public static void main(String[] args){
	
	Complex n1 = new Complex(2,3);
	Complex n2 = new Complex(4,5);
	Complex n3 = new Complex();
	n3.add(n1,n2);
	n3.sub(n1,n2);
	n3.multi(n1,n2);

	}
}