package ch03;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		
		String name;
		int eng, mat, kor, tot; 
		double avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("영어점수 : ");
		eng = scan.nextInt();
		System.out.print("국어점수 : ");
		kor = scan.nextInt();
		System.out.print("수학점수 : ");
		mat = scan.nextInt();
		
		tot = eng+mat+eng;
		avg = (eng+mat+eng) / 4.0;
		
		System.out.println("======================================");
		System.out.println("이름\t영어\t국어\t수학\t총점\t평균");
		System.out.println("=====================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f",name,eng,kor,mat,tot,avg);
		
		
	}
}
