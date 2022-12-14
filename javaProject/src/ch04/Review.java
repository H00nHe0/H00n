package ch04;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
//If문
		int time;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("약속까지 남은 시간을 입력하시오 :  ");
		time = sc.nextInt();
		sc.close();
		
		
		if (time  > 4) {
			System.out.printf("약속시간이 %d시간 남았으니 조금만 더 쉬다가 나가자!",time);
		}else if (time > 2 ){
			System.out.printf("약속시간이 %d시간 남았으니 슬슬 준비하자!",time);
		}else {
			System.out.printf("약속시간이 %d시간 남았으니 얼른 나가자!",time);
		}
		
	}

}
