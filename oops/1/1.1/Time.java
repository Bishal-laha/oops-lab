import java.util.Scanner;

class Time{
	
	int hour;
	int min;
	int sec;
	
	void getTime(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Hour - ");
		hour = in.nextInt();
		System.out.print("Enter Minute - ");
		min = in.nextInt();
		System.out.print("Enter Second - ");
		sec = in.nextInt();
	}
	
	void showTime(){
		if(hour>=12){
			System.out.println("Time is - "+ (hour-12) + ":" + min + ":" + sec + " PM ");
		}
		else{
			System.out.println("Time is - "+ hour + ":" + min + ":" + sec + " AM ");

		}

	}
	
		
}


