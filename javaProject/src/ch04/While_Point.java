package ch04;

import java.util.Scanner;

public class While_Point {

	public static void main(String[] args) {
		int total = 0;//초기식 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("더할 값을 입력 하세요. : ");
		int num = sc.nextInt();
		
		while (num != 0) { //조건식 (0을 입력하기 전에는 무한 루프(반복))
			total += num;
			System.out.println("현재 누적된 값 : " + total);
			System.out.print("계속 입력하세요. ( 종료를 원하면 0을 입력하세요.) ");
			num = sc.nextInt(); //조건식의 무한 루프를 빠져나갈 용도로도 활용.
		}
		System.out.println("총 누적합 : " + total);
		System.out.println("프로그램을 종료합니다. " + total);
		sc.close();
		
	}
}
