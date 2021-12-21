class Main{

	public static void main(String[] args){

		int i;
		double max=0;
		int index=0;

		Manager[] li = new Manager[5];
		li[0] = new Manager(1251,"Amal","Marketing",16000,5000);
		li[1] = new Manager(1345,"Sourav","Sales",11000,6700);	
		li[2] = new Manager(1567,"Bishal","Marketing",36000,8400);	
		li[3] = new Manager(2232,"Koko","Sales",21000,2000);	
		li[4] = new Manager(2598,"Ayush","Development",23000,3500);
		
		for(i=0;i<5;i++){
			if(li[i].getSalary() + li[i].getBonus() > max){
				max = li[i].getSalary() + li[i].getBonus();
				index = i;
			}
		}
		
		System.out.println(li[index].display());
		System.out.println("Total Amount Is - "+max);
		
		
	}

}