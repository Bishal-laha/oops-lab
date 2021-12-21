public abstract class Employee{
	private int id;
	private String name;
	private String dep;
	private double salary;

	Employee(){}
	
	Employee(int id , String name , String dep, double salary){
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}

	public double getSalary(){
		return salary;
	}

	public String display() {
		return "Employee ID - " + id + ", Name - " + name + ", Department - " + dep + ", Salary - " + salary;
	}
}