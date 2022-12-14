package ch06;

public class ReturnEx2 {

	public static void main(String[] args) {
		printScore(101);
	}

	public static void printScore(int k) {
		if (k <= 0 || k >= 100) {
			System.out.println("잘못된 점수 : "+ k);
			return;
		}
		System.out.println("점수 : " + k);
	}
}
