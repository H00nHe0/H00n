package ch12;

public class LocalOuter {
	private int data = 30;
	void display() {//LocalOuter의 멤버 메소드
		class LocalInner{//지역 내부클래스(멤버 메소드안에 클래스)
			void msg() {//LocalInner의 멤버 메소드
				System.out.println(data);
			}
		}//end Inner class
		LocalInner li = new LocalInner();//내부객체 생성
		li.msg();
	}//end method
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}

}
