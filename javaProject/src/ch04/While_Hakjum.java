package ch04;

import java.util.Scanner;

public class While_Hakjum {

	public static void main1(String[] args) {

		int kor,eng,mat =0;
		int tot =0;
		double avg;
		String grade;
		int num = 1;
		String total = "";

		Scanner sc = new Scanner(System.in);
		while ( num <= 3 ) {
			System.out.print(" 국어 성적을 입력하세요: ");
			kor = sc.nextInt();
			System.out.print(" 영어 성적을 입력하세요: ");
			eng = sc.nextInt();
			System.out.print(" 수학 성적을 입력하세요: ");
			mat = sc.nextInt();
			sc.close();
			avg = (kor+eng+mat)/ 3.0;
			tot = kor+eng+mat;
			if (avg >=90 ) {
				grade = "수";
			}else if (avg >=80 ) {
				grade = "우";
			}else if (avg >=70 ) {
				grade = "미";
			}else if (avg >=60 ) {
				grade = "양";
			}else {
				grade = "가";
			}
			total += kor +"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg)+"\t"+grade+"\n";
			num++;
		}
		System.out.println("==============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("==============================================");
		System.out.println(total);
		
	}

	public static void main(String[] args) {
	}
}