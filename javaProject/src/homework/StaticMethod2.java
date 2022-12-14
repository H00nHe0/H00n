package homework;

public class StaticMethod2 {
	//멤버 변수
	static int num= 10;
	static String name ="홍길동";
	String email = "hong@gmail.com";
	String hp = "010-1234-5678";
	String addr = "서울 강남구 역삼동";
	
	public StaticMethod2(int num, String name, String email, String hp, String addr) {
		this.email = email;
		this.hp = hp;
		this.addr = addr;
		this.num = num;
		this.name = name;
	}

	public static void printA() { //static member method
		StaticMethod2 ss = new StaticMethod2(num, addr, addr, addr, addr);
		System.out.println("==========printA()==========");
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+ ss.email);
		System.out.println("전화 : "+ ss.hp);
		System.out.println("주소 : "+ss.addr);
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod2 a = new StaticMethod2();
		a.printB();
		//printB();//main 바깥에 있는 멤버형 nonstatic매서드이기 때문에
		//반드시 객체 생성 이후에 사용할 수 있다.
	}
}
