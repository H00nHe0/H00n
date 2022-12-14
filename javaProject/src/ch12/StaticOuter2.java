package ch12;

public class StaticOuter2 {
	static int data = 30; //static
	int data2 = 50;//non-static
	static class StaticInner2{
		void msg() {
			System.out.println("data is : "+data);
//			System.out.println("data is : "+data2); //non-static 멤버는 사용 불가능
		}
	}
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();//내부static클래스 생성
		in.msg();
	}
	}
