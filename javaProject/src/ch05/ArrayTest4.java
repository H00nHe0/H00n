package ch05;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		size = scan.nextInt();
		int[] scores = new int[size];//사용자 입력값으로 배열의 크기를 지정.
		for ( int i = 0; i < scores.length; i++) { //배열 지정이 되어있지 않기에 반드시 참조변수.length 사용.
			System.out.println("성적을 입력하세요. : ");
			scores[i] = scan.nextInt();
			
			
		}
		for (int i =0; i < scores.length; i++) {
			total += scores[i]; 
			
		}
		System.out.println("평균 성적은 : " + total / scores.length + "입니다.");
		scan.close();
	}
}
