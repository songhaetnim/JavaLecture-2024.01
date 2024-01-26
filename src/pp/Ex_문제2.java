package pp;

public class Ex_문제2 {

	public static void main(String[] args) {
		// Q1 Q1 에서 완선한 코드를 동일한 기능을 수행하는 switch 구문으로 작성하시오.
		int score = 100;
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");
		}
	}

}
