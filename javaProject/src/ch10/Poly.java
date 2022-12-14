package ch10;
class K{//부모 클래스
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}
class V extends K{//자식 클래스
	int a = 20;
	@Override
	public void print() {
		System.out.println(a);
	}
}



public class Poly {
	public static void main(String[] args) {
		V a = new V();
		a.print();
		K b = new K();
		b.print();
		
		K c = new V(); //다형성 , 반드시 좌변은 부모, 우변은 자식클래스
		c.print();
		//다형성을 쓸 때 실제 참조변수가 가리키는 객체가 사용하고자 하는 객체가 맞는지 검사 할때 
		//instanceof 연산자를 사용 할 수 있다.
		System.out.println("c instanceof V? : "+ (c instanceof V));
	}
}
