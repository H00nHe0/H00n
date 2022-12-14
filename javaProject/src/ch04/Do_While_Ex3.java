package ch04;

public class Do_While_Ex3 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		int num = 100;
		
		do {
			sum += i;
			i++;
		}while(i <= num);
		System.out.println("1~" +num+"까지의 합계 : " + sum);
	}

}
