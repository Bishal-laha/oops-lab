import java.util.Scanner;
class Main{

	public static void main(String[] args){
		int ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter type of vehicle -- 1.Lightmotor Vehicle  2.Heavymotor Vehicle");
		ch = s.nextInt();
		switch(ch){
			case 1: System.out.println("Enter no of vehicle - ");
				int n;
				n = s.nextInt();
				LightMotorVehicle[] li = new LightMotorVehicle[n];
				for(int i=0;i<n;i++){
					li[i] = new LightMotorVehicle();
					li[i].acceptNumLMV();
				}
				for(int i=0;i<n;i++){
					li[i].displayLMV();
				}
				break;

			case 2: System.out.println("Enter no of vehicle - ");
				int m;
				m = s.nextInt();
				HeavyMotorVehicle[] hv = new HeavyMotorVehicle[m];
				for(int i=0;i<m;i++){
					hv[i] = new HeavyMotorVehicle();
					hv[i].acceptNumHMV();
				}
				for(int i=0;i<m;i++){
					hv[i].displayHMV();
				}
				break;
		}
	}
}