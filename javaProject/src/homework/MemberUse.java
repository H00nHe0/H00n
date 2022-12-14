package homework;

import review.Member;

public class MemberUse {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "hong", 120000);
		Member m2 = new Member();
		m1.print();
		m2.print();
		
	}
}
