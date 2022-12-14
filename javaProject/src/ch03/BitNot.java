package ch03;

public class BitNot {

	public static void main(String[] args) {
		// ~연산자(비트값을 반전, 0을 1로, 1을 0으로)
		//not비트 = 계산시 첫째로 반전시키고 다시 한번 반전시킬 때,
		//오른쪽 끝 비트를 제외하고 반전시킨 후 ,
		//앞의 부호(+ or -)도 반전시킨다.
		byte a = 10;
		System.out.println(a); // 1010
		System.out.println(~a); // 0101 = > -1011
	}

}
