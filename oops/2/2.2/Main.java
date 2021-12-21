class Main{

	public static void main(String[] args){
		Teacher t1[] = new Teacher[1];
		Student s1[] = new Student[1];
		t1[0] = new Teacher("Ramesh","Mumbai",7865945634L,"Techno India","C.S.E.",6,"OOPS");
		s1[0] = new Student("Bishal","Kolkata",8456734221L,"Techno India","C.S.E.",5,3);
		System.out.println(t1[0].toString());
		System.out.println(s1[0].toString());
	}
}