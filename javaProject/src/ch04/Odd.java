package ch04;

public class Odd {

	public static void main(String[] args) {

		int sum = 0;
		for ( int i = 0; i <= 10; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}System.out.println("1~10사이의 홀수의 합은? : "+ sum);

	}
}
