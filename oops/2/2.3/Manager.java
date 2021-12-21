class Manager extends Employee{

	private double bonus;

	Manager(int id, String name, String dep, double salary, double bonus){
		super(id, name, dep, salary);
		this.bonus = bonus;
	}
	
	public double getBonus(){
		return bonus;
	}

	public String display() {
		return "Manager [Details: " + super.display()+", Bonus - " + bonus + "]";
	}

	

		

	
}