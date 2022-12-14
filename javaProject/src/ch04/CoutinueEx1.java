package ch04;

public class CoutinueEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if ( i % 5 == 0) {//5의 배수를 만나면
				continue; // 조건 충족시 이하 코드무시(skip)하고 다음 계속수행
			}
			System.out.println(i);
		}
	}

}
