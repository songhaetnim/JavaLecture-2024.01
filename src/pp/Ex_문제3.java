package pp;

public class Ex_문제3 {

	public static void main(String[] args) {
		// Q3 다음과 같이 출력되도록if문과 break,continue를 이용해for  문 코드를 완성하시오.
		
		for(int i = 0; ; i++) {
			if(i % 2 - 1 == 0) {
				continue;
			}
		if (i > 10)
			break;
		System.out.println(i);         
	   // 실행결과 > 0, 2, 4, 6, 8, 10

		}
	}
}



