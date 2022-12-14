package homework;
import java.util.Scanner;
public class ArrayScore2D_Scan {
	public static void main(String[] args) {

		int[][] score = {};
		int num;
		String grade = "";
		int tot;
		
		Scanner scv = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요  : ");
		num = scv.nextInt();
		score = new int[num][3];
		System.out.println("국,영,수 점수를 각각 입력하세요 :");
		for (int i =0; i <num; i++) {
			System.out.println((i+1)+"번 학생의 점수 : ");
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = scv.nextInt();
			}
		}	
		System.out.println("===============================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("===============================================================");
		for (int i =0; i <num; i++) {
			tot = 0;
			System.out.print((i+1)+"\t" );
			for (int j = 0; j < score[i].length; j++) {
				tot += score[i][j];
			System.out.print(score[i][j] +"\t" );
			}
			double avg = (double)tot/score[i].length;
			switch ((int)avg /10){
			case 10: case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default : grade = "F"; break;
			}System.out.printf("%d\t%.1f\t%s\n",tot,avg,grade);
		}scv.close();
	}
}




