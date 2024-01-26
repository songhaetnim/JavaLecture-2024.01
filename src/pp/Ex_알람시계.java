package pp;

import java.util.Scanner;

public class Ex_알람시계 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇시?");
		int hour = Integer.parseInt(scan.nextLine());
		System.out.print("몇분?");
		int minute = Integer.parseInt(scan.nextLine());
		
		int newHour = 0, newMinute = 0;
		if (minute >= 45) {
		    newHour = hour;
		    newMinute = minute - 45;
		} else {
		    if (hour == 0){
		        newHour = 23;
		        newMinute = minute + 60 - 45 ;
		    } else {
		        newHour = hour - 1;
		        newMinute = minute + 60 - 45 ;
		    }
		}

		System.out.println(hour + "시 " + minute + "분 " + newHour +"시" + newMinute + "분");

	}

}
