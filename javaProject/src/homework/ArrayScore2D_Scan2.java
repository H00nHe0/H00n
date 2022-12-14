package homework;

import java.util.Scanner;

public class ArrayScore2D_Scan2 {

	public static void main(String[] args) {

		Scanner scv = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요  : ");
		int num = scv.nextInt();
		int n = 3;
		int[][] score = new int[num][n];
		System.out.println("국,영,수 점수를 각각 입력하세요 :");
		for (int i =0; i <num; i++) {
			System.out.print((i+1)+"번 학생의 점수 : ");
			for (int j = 0; j < n; j++) {
				score[i][j] = scv.nextInt();
			}	
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for ( int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			char grade = ' ';
			
			System.out.printf("%d\t" ,i+1); //번호 출력
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t",score[i][j]);
			}
			avg = sum /(float)score[i].length;//평균
			
			switch ((int)avg /10){
			case 10: case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade = 'F'; break;
		}
			System.out.printf("%d\t %.1f\t %s\n",sum,avg,grade);
		}
	}

}
		
			
			

