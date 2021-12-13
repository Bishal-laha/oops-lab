class Rectangle extends Shape{
	double h;
	double b;
	
	Rectangle(double h,double b){
		this.h = h;
		this.b = b;
	}
	public double calculateArea(){
		return h*b;
	}
	
	public void display(double res){
		System.out.println("Area of Rectangle - " + res);
	}

	
}