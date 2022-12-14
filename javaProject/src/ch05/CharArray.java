package ch05;

public class CharArray {

	public static void main(String[] args) {
		char[] ch = {'j','a','v','a'};
//		배열 참조변수.length =>배열의 사이즈
//		char[] ch;  //배열 참조변수 선언
//		ch = new char[4]; // 배열생성과 동시에 배열의 갯수 처리
//		ch[0] = 'j';
//		ch[1] = 'a';
//		ch[2] = 'v';
//		ch[3] = 'a';
		
		for ( int i =0; i < ch.length; i++) {
			System.out.println(i + "번째 문자 : "+ ch[i]);
		}
	}
}
