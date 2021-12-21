class NewArithmaticException extends Exception{
	int i;
	
	NewArithmaticException(){}

	NewArithmaticException(int i,String s){

		super(s);
		this.i = i;

	}
	public int GetI(){
		return i;
	}





}