package ch10;

public class Test {	
	static int a;//static member
	int b; //non static member
	
	void print() {//non static member method
		System.out.println(a); //static -> 이미 메모리에 올라와있기 때문에 문제없다.
		System.out.println(b); // non static
	}
	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println(a);
		System.out.println(t.b);
//		t = null; //객체의 주소값을 초기화(주소값을 잃어버린다.)
		t.print();
	
	}

}
