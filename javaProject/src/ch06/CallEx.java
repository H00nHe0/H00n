package ch06;

public class CallEx {

	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		
		test(a); // a는 call by value 형식으로 호출.
		          //메소드 호출,괄호안에 값이 있을수도, 없을수도,
		
		test2(a);
		System.out.println("끝");
	}//프로그램 끝

	public static void test2(int a) {
			System.out.println(a);
			
		}

	public static void test(int b) { //메소드와 실제 호출 변수는 다를 수 있다.
		System.out.println("Test method 호출");
		System.out.println(b);
	}
}
