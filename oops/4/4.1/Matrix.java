import java.util.*;
class Matrix{
 	public int[][] arr;
	int row;
	int col;
	int ele,i,j;
	
	
	

	Matrix(int r, int c){
		arr = new int[r][c];
		row = r;
		col = c;
	}

	public void setEle(int r, int c, int ele){

		arr[r][c] = ele;

	}

	public int getEle(int  r, int c){

		return arr[r][c];
	}

	public Matrix add(Matrix obj, Matrix obj1) throws AdditionNotPossibleException{
		Matrix obj2 = new Matrix(3,3);
		if(obj.row == obj1.row && obj.col== obj1.col){
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					obj2.setEle(i,j,(obj.getEle(i,j) + obj1.getEle(i,j)));
				}
			}
			
		}
		else{
			throw new AdditionNotPossibleException();
		}
		return obj2;
	}

	public void print(){
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print(" "+arr[i][j]);
				if(j==2){
					System.out.print("\n");
				}
			}
		}
	}

	


}
