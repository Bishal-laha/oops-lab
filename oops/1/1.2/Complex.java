
class Complex{
	int real;
	int img;

	Complex (){
	}

	
	Complex(int r , int i){
		this.real = r;
		this.img = i;
	}

	void add(Complex n1, Complex n2){
		Complex result = new Complex(0,0);
		result.real = n1.real + n2.real;
		result.img = n1.img + n2.img;
		System.out.println("No. is - "+result.real + "+" + result.img + "i");
		
	}
	
	void sub(Complex n1, Complex n2){
		Complex result = new Complex(0,0);
		result.real = n1.real - n2.real;
		result.img = n1.img - n2.img;
		System.out.println("No. is - "+result.real + "+" + result.img + "i");
		
	}

	void multi(Complex n1, Complex n2){
		Complex result = new Complex(0,0);
		result.real = ((n1.real * n2.real) - (n1.img * n2.img));
		result.img = ((n1.img * n2.real) + (n1.real * n2.img));
		System.out.println("No. is - " + result.real + "+" + result.img + "i");
		
	}
}
