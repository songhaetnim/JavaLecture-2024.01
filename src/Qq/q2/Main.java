package Qq.q2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		list = getMemberList();
		list.get(0).setTel("010-1234-5678");
		list.get(1).setTel("010-4321-8765");
		list.forEach(x -> System.out.println(x));

	}

	public static List<Member> getMemberList() {
		List<Member> members = new ArrayList<Member>();
		members.add(new Member(1, "james",1992,"010-1234-5678"));
		members.add(new Member(2, "maria",1995,"010-4321-8765"));
		return members;
		}
}

