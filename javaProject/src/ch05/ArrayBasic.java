package ch05;

public class ArrayBasic {
	public static void main(String[] args) {
		int[] score; //배열 참조변수 선언
		score = new int[5];//new를 통해 메모리에 5개의 int형 생성.
		//배열생성(4byte x 5 = 20byte) 가성비가 안좋을수도
		//*가장 정석 1~2줄*
		
		//int[] score = new int[5]; //한줄 기법
		
		System.out.println(score);// score는 메모리의 주소값을 가리키는 참조변수이다.
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 60;
		score[4] = 70;
		// score[5] = 90;  ->범위 초과로 오류
		
		//int[] score = {100,90,80,60,70}; //실무 기법
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		//배열을 다루는데 있어 for문은 필수적으로 사용된다.
		for ( int i =0; i < 5; i++) {
			System.out.println(score[i]);
		}
		
	}
}
