package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요 : ");
		int year = sc.nextInt();
		GregorianCalendar cal = new GregorianCalendar();
//		if(cal.isLeapYear(year)) {//윤년계산 메소드 : isLeapYaer
//			System.out.println("윤년입니다.");
		if((year%4 == 0 && year%100 != 0) || year%400 ==0) { //윤년 계산 공식.
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
	}

}
