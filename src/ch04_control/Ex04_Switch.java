package ch04_control;

public class Ex04_Switch {

	public static void main(String[] args) {
		String s ="Hello";
		System.out.println(s.equals("hello"));
		
		switch(s) {    //  엄격한 자바에선 사용가능 > switch/case 에서는 문자열을 사용할 수 있음
		case "Hello":
			System.out.println(true); break;
		case "hello":
			System.out.println("대소문자 구분");
			default:
				System.out.println(false);
		}

	}

}
