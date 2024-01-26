package pp;

import java.util.Scanner;
// static X
public class pp2 {
	 Scanner scanner = new Scanner(System.in);

	// 계좌생성하기
	public void createAccount (Account[] accountArray) {
		System.out.println("계좌번호: " );
		String ano = scanner.nextLine();
		System.out.println("계좌주: ");
		String owner = scanner.nextLine();
		System.out.println("초기금액: ");
		int balance = Integer.parseInt(scanner.nextLine());

		Account aa = new Account();
		aa.setAno(ano);
		aa.setOwner(owner);
		aa.setBalance(balance);
		accountArray[1] = aa;
		
//		for

	}

	// 계좌목록보기
	private static void accountlist() {

	}

	// 예금하기
	private static void accountdeposit() {
		// 작성위치--------호출해서 이용

	}

	// 출금하기
	private static void accountwithdraw() {
		// 작성위치------호출해서 이용

	}
}
