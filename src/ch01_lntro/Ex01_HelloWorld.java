package ch01_lntro;

// class 이름은 Ex01 _HelloWorld 대문자로 시작
public class Ex01_HelloWorld {
 /**
  * 도큐먼트 주석 - API document 만들때 사용
  */
   // method 이름 main은 소문자로 시작
  // public: 접근 제한자 static = 메로리 영역에 어디에 달렸는지
 // void = 리턴할게 없다...
	
	public static void main(String[] args) {
		//sysout, syso 를 타이핑 한 후 Ctrl + Spacec 치면 System.out.println()이 생김 
		System.out.println("HelloWorld!!!");  //문장 끝에는 반드시 세미콜론(;)을 붙여야 함인라인 주석
		/*
		 * 여러줄의 주석
		 */
		System.out.println("안녕하세요?"+"여러분!!!!"); // 하나의 문자열만 올 수있음(두개 이상일 경우에는  + 연산자를 사용해야 함)
//		System.out.println();   //ctrl +/ : 문장을 커멘트 처리(처리했다,안했다 확인 가능,토글)
	}

}
