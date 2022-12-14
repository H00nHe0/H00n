package homework;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {

		int num;
		int tot=0;
		double avg = 0;
		Scanner scv = new Scanner(System.in);
		System.out.print("성적처리할 학생 수를 입력하세요 >> ");
		num = scv.nextInt();
		int stu[] = new int[num];
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			stu[i] = scv.nextInt();
		}
		for (int i = 0; i < stu.length; i++) {
			tot += stu[i];
			avg = (double)tot/stu.length;
				}scv.close();
	System.out.println("====================");
	System.out.println("총점은 " + tot + "점 입니다.");
	System.out.println("평균은 " + String.format("%4.1f", avg) + "점 입니다.");
	}
}
