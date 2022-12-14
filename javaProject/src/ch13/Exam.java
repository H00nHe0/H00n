package ch13;

//import java.lang.*;//가 생략되어있음

public class Exam {//extends Object가 생략되어 있음

	public static void main(String[] args) {
		String a = "hello"; //String pool이라는 메모리 영역에 값이 저장됨.
		System.out.println(System.identityHashCode(a));
		//identityHashCode : String의 전용 객체주소 확인용 메소드.
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		System.out.println(a == b);// 주소값 비교(true => 주소값이 같다.)
		
		String c = new String("hello");//new를 통해 객체 생성
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");//new를 통해 개체생성시 새로운 주소값을 가진다.
		System.out.println(System.identityHashCode(d));
		System.out.println(c == d); //주소값 비교 => 주소값이 다르기에 false
		System.out.println(c.equals(d)); //내용을 비교 => 내용이 같기에 true
		
	
	}	

}
