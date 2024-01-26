package pp;

public class Ex_문제4 {

	public static void main(String[] args) {
		// Q4 다음 for문과 동일한 기능을 수행하는 while문을 작성하시오.
		
		int num = 10;
		while (num > 0) {
			System.out.println(num);
			num -= 2;
		}		
		for(int i = 10; i > 0; i -= 2) {
			System.out.println(i);
		}

	}

}



