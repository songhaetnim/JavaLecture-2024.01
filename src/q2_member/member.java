package q2_member;

import java.time.LocalDate;

import ch06_class.sec01_member.Member;

public class member {
	private int mid;
	private String name;
	private int birthYear;
	private String tel;
	public Member(int mid, String name, int birthY)

}
	@Override
	public String toString() {
		return "member [mid=" + mid + ", name=" + name + ", birthYear=" + birthYear + ", tel=" + tel + "]";
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getTel() {
		return tel;
	}
	private int getAge() {
		LocalDate todayDate = LocalDate.now();
		return todayDate.getYear() -birthYear;
		
	}
	

	}
