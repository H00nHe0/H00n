package ch04;

import java.util.Scanner;

public class Ecost {

	public static void main(String[] args) {
		//변수 선언
		String name = ""; //이름
		int price = 0; // 구매금액
		int points = 0; //포인트
		int point_use = 0; //포인트 사용액
		int fee = 0; //배송료
		int pay = 0; //실제 결제금액
		//데이터 입력

		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = scan.next();//문자열입력
		System.out.print("구매금액을 입력하세요 : ");
		price = scan.nextInt();//정수 입력
		System.out.print("보유한 포인트를 입력하세요 : ");
		points = scan.nextInt();//정수입력
		scan.close();
		
		//계산
		
		if (price < 20000 ) {
			fee = 2500;
		}
		if (points >= 10000 ) {
			point_use = points;
			pay = price + fee - points;
		}else {
			pay = price + fee;
		}
		//출력
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
	}

}
