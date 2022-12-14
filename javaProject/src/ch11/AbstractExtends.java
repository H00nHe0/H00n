package ch11;

public class AbstractExtends extends AbstractClass {
	@Override //오버라이딩은 부모쪽에 있는 미완성된 메소드를 구현하는 의미도 포함
	void method1() {
		System.out.println("추상 method를 완성한 method");
	}
	public static void main(String[] args) {
//		AbstractClass a1 = new AbstractClass(); 추상클래스는 인스턴스를 생성할 수 없다.
		//추상메소드가 있는 추상클래스,인터페이스이건 new를 통해서 인스턴스화 불가능/스스로 객체생성x
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}
}
