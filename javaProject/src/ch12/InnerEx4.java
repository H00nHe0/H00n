package ch12;

class Outer{
	class InstanceInner{//내부클래스 
		int a = 100; // non-static member
	}
	static class StaticInner{ //static 내부클래스
		int a =200; // non-static
		static int b = 300; //static
	}
	void myMethod() {//Outer class의 멤버 메소드
		class LocalInner{//지역 중첩클래스
			int a = 400; //non-static
		}//end inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : "+ i.a);
	}//end method
}

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner i = oc.new InstanceInner();
		System.out.println("i.a : "+ i.a);
		System.out.println("Outer.StaticInner.b : " +Outer.StaticInner.b );
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : "+si.a);
		//non static멤버는 static class 안에 있더라도 반드시 new를 통해 생성한 후 사용해야한다.
		oc.myMethod();
	}
}
