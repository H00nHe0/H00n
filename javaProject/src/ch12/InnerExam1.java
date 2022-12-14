package ch12;
public class InnerExam1 {
	class Ca1{ //멤버변수를 선언하는 위치에 있는 경우는 인스턴스 클래스(중첩클래스)라 한다.
		int value = 0;
		public void plus() {
			value++;
		}
	}//end inner class
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1(); //1.외부객체 생성
		//외부클래스이름.내부클래스이름 참조변수 = 외부참조변수.new 내부클래스생성자();
		InnerExam1.Ca1 ca1 = t.new Ca1(); //2.내부객체 생성
		ca1.plus();
		System.out.println(ca1.value);
		
	}
}