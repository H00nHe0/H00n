package ch06;

//매소드 사용
public class MethodEx2 {
	
	//메인 메소드(프로그램의 시작이자 끝)
	//메인 메소드는 해당 코딩 영역에서 위치와 상관없다.
	public static void main(String[] args) {

		System.out.println("합 (1~10) : " + sum(1,10));
		System.out.println("합 (10~100) : " + sum(10,100));
		System.out.println("합 (100~1000) : " + sum(100,1000));
		//프로그램 끝
	}
	//사용자의 정의 메소드
	public static int sum(int a, int b) {
		int sum = 0;//반환용도
		for ( int i =a; i <= b; i ++) {
			sum += i;
		
		}	return sum;
	}
}
