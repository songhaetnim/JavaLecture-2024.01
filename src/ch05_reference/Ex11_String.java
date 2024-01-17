package ch05_reference;

public class Ex11_String {

	public static void main(String[] args) {
		// Steing 생성
		String str1 = new String("문자열");
		String str2 ="문자열";
		
		byte[] bytes = {72,101,108,111,32,74,97,118,97}; // Hello Java
		String str3 = new String(bytes);
		System.out.printf("%s,%s, %s%n", str1, str2, str3);
		//String 객제내의 값을 변경불가(새로운 객체를 생성해서 변경한다)
		//String 빌더 / 범벅
		
		String str4 ="문자열";
		System.out.println(str2 == str4); // str2와 str4가 가르키는 곳이 동일함 
											
		
	    Person james = new Person("제임스", 29, "프로그래머");
	    Person maria = new Person("마리아", 23, "학생");
	    System.out.println(james + " - 123"); // Person class의 toString() method 적용
	    System.out.println(maria + " - 456");
		
		// 1. 객체내의 값 변경 불가능 -> 값 변경시 새로운 객체를 생성하여 작성
		// 실수가 문자열에 붙으면 문자열이 된다
	    //투스 랭기지

	}

}
