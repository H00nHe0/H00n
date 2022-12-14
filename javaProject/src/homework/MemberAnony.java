package homework;

interface Member{
	int NUM =2; void name(); void eMail(); } 

public class MemberAnony implements Member{
	String name = "김길동";
	String eMail = "kim@gmail.com";
	@Override
	public void name() {System.out.println("");
	}
	@Override
	public void eMail() {System.out.println("");
	}

	public static void main(String[] args) {
		
		MemberAnony a = new MemberAnony() {
			@Override
			public void name() {
				System.out.println("-----------------------");
				System.out.println("고객번호 : "+NUM);
				System.out.println("이름 : "+ name);}
			@Override
			public void eMail() {
				System.out.println("이메일 : "+ eMail);
				System.out.println("-----------------------");}
		};
		a.name();a.eMail();
	}
}
