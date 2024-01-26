package ch17_collection.part2_set.sec12_member;

import java.util.Set;
import java.util.TreeSet;

public class MemberTreeSetMain implements Comparable{ // 트리 형태로 들어갈려면 implements Comparable 해서 compareTo 메서드 구현 필요

	public static void main(String[] args) {
		// 객체 트리셋
		 
		Set<Member> set = new TreeSet<>();
		
		set.add(new Member(21, "james"));
		set.add(new Member(20, "maria"));
		set.add(new Member(21, "james"));
		System.out.println(set);
		
	}
	
	// *TreeSet, TreeMap에서 사용되는 객체는 Comparable I/F 구현 필요
	// *트리셋에선 0, 음수, 양수로 대소 비교
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			return this.compareTo(m.getName());
		}else {
			return 0; // 0이면 같다고 판단 			
		}
	}
	

}
