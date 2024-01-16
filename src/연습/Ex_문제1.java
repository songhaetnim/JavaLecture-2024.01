package 연습;

public class Ex_문제1 {

	public static void main(String[] args) {
		// 다음과 같이 점수 (score)에 따라 학점이 부여되는 코드를 작성하고자 한다.
		// if 선택 제어문의 조건식을 완성하시오(단, O < score <100.)

		int score = 90;
		if (score >= 80 && score < 90) {
			System.out.println("B학점");
		} else if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 70 && score < 80) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
	}
}
