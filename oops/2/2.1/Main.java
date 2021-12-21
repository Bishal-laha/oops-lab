class Main{
	public static void main(String[] args){

		Rectangle r1 = new Rectangle(9,6);
		double res  = r1.calculateArea();
		r1.display(res);
		Triangle t1 = new Triangle(4,3);
		double res1 = t1.calculateArea();
		t1.display(res1);
	}


}
