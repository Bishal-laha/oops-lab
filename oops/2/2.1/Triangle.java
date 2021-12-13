class Triangle extends Shape{
	double height;
	double base;
	
	Triangle(double height , double base){
		this.height = height;
		this.base = base;
	}
	public double calculateArea(){
		return (0.5*height*base);
	}
	
	public void display(double res){
		System.out.println("Area of Triangle - " + res);
	}


}