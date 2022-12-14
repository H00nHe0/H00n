package ch04;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {

		int kor =0;
		int eng =0;
		int mat =0;
		int tot = 0;
		double avg = 0.0;
		String grade = "";
		String result = "";
	
			Scanner sc = new Scanner(System.in);
			
			for ( int i =1; i <=3; i++) {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			mat = sc.nextInt();

			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			if (tot / 3.0 >= 90) {
				grade = "수";
			}else if (tot / 3.0 >= 80) {
				grade = "우";
			}else if (tot / 3.0 >= 70) {
				grade = "미";
			}else if (tot / 3.0 >= 60) {
				grade = "양";
			}else {
				grade = "가";
			}
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg)+"\t"+grade+"\n";
		}
		System.out.println("=================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("=================================================");
		System.out.printf(result);
		sc.close();
	}
	
}
