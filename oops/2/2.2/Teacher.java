class Teacher extends Person{

	String dep;
	int noofclass;
	String subject;

	Teacher(String name, String address, long phoneno, String college, String dep, int noofclass, String subject){
		super(name, address, phoneno, college);
		this.dep = dep;
		this.noofclass = noofclass;
		this.subject = subject;
	}


	public String toString(){
		return "Teacher: ["+"Name - "+name+", Address - "+address+", Phone No. - "+phoneno+", College - "+college+", Department - "+dep+", No. Of Classes In A Week - "+noofclass+", Subject - "+subject+"]";

	}
		


}