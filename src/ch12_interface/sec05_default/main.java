package ch12_interface.sec05_default;

public class main { 

	public static void main(String[] args) { // 스프링부트를 사용하면 안쓴다.
		A a = new B();                        // 사실상 사용하지 않는다.
		a.abc();
		a.def();
		
		
		a = new C();
		a.abc();
		a.def();
		
		A.ghi();

	}

}
