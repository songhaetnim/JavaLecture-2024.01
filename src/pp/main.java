package pp;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Account[] accountArray = new Account [100];
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		pp2 sc = new pp2();
		
		while(run) {
			System.out.println("===============================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===============================");
			System.out.println("선택> ");
			
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				sc.createAccount(accountArray);
			}else if(selectNo == 2) {
				System.out.println(accountArray[2]);
			}else if(selectNo == 3) {
				
			}else if(selectNo == 4) {
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

	





}




