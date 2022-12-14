package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {

		int dan;
		int num = 1;
		int result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요: ");
		dan = sc.nextInt();
		
		while ( dan <= 9) {
			while (num <= 9) {
				result = (dan*num);
				System.out.println(dan + " x "+ num+ " = "+ result);
				num++;
			}
		}sc.close();
	}
}
