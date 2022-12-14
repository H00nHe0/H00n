package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));//소수점 올림
		System.out.println(Math.round(10.5));//소수점 반올림
		System.out.println(Math.round(10.4));
		System.out.println(Math.floor(10.9));//소수점 아래 버림
		System.out.println(Math.pow(10, 3)); //10의 3제곱
		System.out.println(Math.pow(2, 4));
		Random rand = new Random();
		System.out.println("정수값 : " + rand.nextInt(100)); //100이하의 랜덤 정수 발생
		System.out.println("정수값 : " + rand.nextDouble());//1이하의 랜덤 실수 발생
	
		int a = 10;//기본 자료형
		Integer b = 20;//객체 자료형(Wrapper 클래스), 옛버전에서는 에러, intValue()가 작동
		Integer c = new Integer(30); // 정식문법
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
		
	
	
	
	}
	
}
