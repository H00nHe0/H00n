package homework;

public class MemberOuter {
	private int num = 1;
	private String name = "홍길동";
	private String eMail = "hong@gmail.com";

	class MemberInner {
		void gstInfo() {
			System.out.println("-------------------------");	
			System.out.println("고객번호 : "+ num);	
			System.out.println("이름 : "+ name);	
			System.out.println("이메일 : " + eMail);	
			System.out.println("-------------------------");	
		}
	}
	public static void main(String[] args) {
		MemberOuter m = new MemberOuter();
		MemberOuter.MemberInner i = m.new MemberInner();
		i.gstInfo();
	}
}

