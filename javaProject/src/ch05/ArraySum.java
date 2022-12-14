package ch05;

public class ArraySum {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		int sum = 0; //배열의 합계 저장할 변수
		
		for ( int i = 0; i < 5; i++) {
			sum = sum + num[i];
		}
//		for ( int i = 0; i < num.length; i++) {
//			sum = sum + num[i];
//		} // 참조변수.length사용으로 변수 개수 자동.
		System.out.println("합계 : "+ sum);
	}
}
