package homework;

public class ArraySum {

	public static void main(String[] args) {

		//		int[] num = {10,20,30,40,50};   =>약식 배열

		int[] num;
		num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;    // 정석 배열 선언 및 생성

		int sum = 0; 

		for ( int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("합계 : "+ sum);
	}
}
