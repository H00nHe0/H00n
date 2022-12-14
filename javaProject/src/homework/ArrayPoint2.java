package homework;
import java.util.Scanner;
public class ArrayPoint2 {

	public static void main(String[] args) {
		String[] name = new String[2];
		int[] kor = new int[2]; 
		int[] eng = new int[2];
		int[] mat = new int[2];
		int[] sum = new int[2];
		double[] avg = new double[2];
		double tot_avg = 0;
		
		Scanner scv = new Scanner(System.in);
		System.out.println(name.length +"명의 학생의 국,영,수 점수를 각각 입력하세요.");
		
		for (int i = 0; i < name.length; i++) {
		System.out.print(" 이름 : ");
		name[i] = scv.next();
		System.out.print(" 국어 : ");
		kor[i] = scv.nextInt();
		System.out.print(" 영어 : ");
		eng[i] = scv.nextInt();
		System.out.print(" 수학 : ");
		mat[i] = scv.nextInt();
		}scv.close();
		for ( int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + mat[i];
			avg[i] = sum[i]/3.0;
			tot_avg += avg[i] ; 
			
			System.out.println("이름 : "+ name[i]);
			System.out.println("국어 : "+ kor[i]);
			System.out.println("영어 : "+ eng[i]);
			System.out.println("수학 : "+ mat[i]);
			System.out.println("총점 : "+ sum[i]);
			System.out.println("평균 : "+ String.format("%4.1f", avg[i]));
			System.out.println();
		}
		
		System.out.println("==============");
		System.out.println("학급평균 : "+ String.format("%4.1f",tot_avg/2));
	}
	}


