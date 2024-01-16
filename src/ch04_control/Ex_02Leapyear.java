package ch04_control;

import java.util.Scanner;

public class Ex_02Leapyear {

	public static void main(String[] args) {
		System.out.print("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		int year = Integer.parseInt(inputStr);
		scan.close();
		
		if (year % 4 == 0){
		    if (year % 100 == 0){
		        if (year % 400 == 0){
		        	System.out.print(year + "년은 윤년입니다.");   
		        } else{
		            System.out.print(year + "년은 평년입니다.");   
		        }
		    } else {
		        	System.out.print(year + "년은 윤년입니다.");   
		    }
		} else {
		    	    System.out.print(year + "년은 평년입니다.");   
		}

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.print(year + "년은 윤년입니다.");
		else
			System.out.print(year + "년은 평년입니다.");

	}

}
