class Student extends Person{

	String dep;
	int dayspresent;
	int year;

	Student(String name, String address, long phoneno, String college, String dep, int dayspresent, int year){
		super(name, address, phoneno, college);
		this.dep = dep;
		this.dayspresent = dayspresent;
		this.year = year;
	}


	public String toString(){
		return "Student: ["+"Name - "+name+", Address - "+address+", Phone No. - "+phoneno+", College - "+college+", Department - "+dep+", Days Present In A Week - "+dayspresent+", Year - "+year+"]";

	}
		


}