package ch04;

import java.util.Scanner;

//휴가일수 계산
		//근속연수 1~3년 ==> 3일, 4~9년 ==>5일
		//10년이상 10일, 20년이상 20일.

public class Holiday {

	public static void main(String[] args) {
		int year; //근속연수
		int days; //휴가일수
		
		Scanner scan = new Scanner(System.in);
		System.out.print("근속연수를 입력하세요. : ");
		year = scan.nextInt(); //키보드로부터 숫자를 입력받음
		scan.close();
		
		if (year <= 3) {
			days = 3;
		}else if (year < 10) {
			days = 5;
		}else if (year < 20) {
			days = 10;
		}else { //그 외의 모든 경우
			days = 20;
		}
		System.out.println("당신의 근속연수는 " + year + "년이고 ");
		System.out.println("당신의 휴가일수는 " + days + "입니다. ");
		
	}

}
