package ch06;

public class VoidExam {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		hello();
		System.out.println("프로그램 끝");
		
	}

	public static void hello() { //void = 리턴할 값이 없음
		System.out.println("안녕하세요?");
		return; //명시적으로 메소드를 종료한다. (반환할 값이 없으면 생략가능)
	}
}
