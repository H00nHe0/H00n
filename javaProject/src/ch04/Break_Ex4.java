package ch04;

public class Break_Ex4 {

	public static void main(String[] args) {

		int n = 1;
		while ( n <= 10) {
			System.out.println(n + " Hello World");
			n++;
			if (n ==8) {
				break;//n값이 8일때 빠져 나가라.
			} 
		}//while문
		System.out.println("n값이 8이어서 while문을 빠져나옴");
	}
}
