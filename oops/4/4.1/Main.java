import java.util.*;
class Main{

	public static void main(String[] args)throws AdditionNotPossibleException{
		int i,j,ele;
		Matrix obj = new Matrix(3,3);
		Matrix obj1 = new Matrix(3,3);
		Matrix obj2 = new Matrix(3,3);
		Scanner sc = new Scanner(System.in);
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				ele = sc.nextInt();
				obj.setEle(i,j,ele);
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				ele = sc.nextInt();
				obj1.setEle(i,j,ele);
			}
		}
		obj2 = obj2.add(obj,obj1);
		obj2.print();
		
		

	}




}