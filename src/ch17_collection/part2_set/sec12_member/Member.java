package ch17_collection.part2_set.sec12_member;

public class Member {

	private int age;
	private String name;
	
	public Member() {}
	
	public Member(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	

}
