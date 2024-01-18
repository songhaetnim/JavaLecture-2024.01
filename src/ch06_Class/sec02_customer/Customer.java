package ch06_Class.sec02_customer;// 패키지 만들고 시작

public class Customer {
	private int cid; // 고유값   // 필드를 만들어 놓고 마우스 오른쪽클릭후 소스 같은 창을킬것
	private String name;
	private int age;
	private boolean adult;

	
	// 생성자 (Constructor)
	public Customer() { }
	public Customer(int cid, String name, int age) {
//		this.cid = cid;
//		this.name = name;
//		this.age = age;
//		this.adult = age > 19 ? true : false;
		this(cid, name, age, age > 19 ? true : false);
	}
	public Customer(int cid, String name, int age, boolean adult) {
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}


	// toString() methhod
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}
	
	
	
	
	// Getter/Setter method
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAdult() {  // boolean는 is로 시작한다 
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	// 패키지를 쓰고 점을 찍으면 디렉토리가 나온다
	// class 는 대문자
	// 메소드는 소문자
	// Customer 메소드만 대문자로 시작한다
	
	










}






