package ch10;

public class StaticVar {
	static int a = 10;
	int b = 20; //non static
	public static void main(String[] args) {
		System.out.println(StaticVar.a); //클래스이름.static member변수
		
		StaticVar s = new StaticVar();
		System.out.println(s.b); //non static은 new해서 객체 생성후 접근
	}
	
}
