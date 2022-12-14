package homework;

public class ArrayScore2D {

	public static void main(String[] args) {

		int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i =0; i <score.length; i++) {
			int sum = 0; //총점
			float avg = 0.0f; //평균
			String grade = ""; //등급
			
			System.out.printf("%d\t",i+1); //번호 출력
			for (int j = 0; j < score[i].length; j++) {//국,영,수 배열값 출력
				sum+= score[i][j];
			System.out.printf("%d\t", score[i][j]);
			}
			avg = sum / (float)score[i].length;
			
			switch ((int)avg /10){
			case 10: case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default : grade = "F"; break;
			}
			System.out.printf("%d\t%.1f\t%s\n",sum,avg,grade);
		}
	}
}
