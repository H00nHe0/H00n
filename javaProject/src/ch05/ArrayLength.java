package ch05;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		int intArray[] = new int[5];//배열 선언과 생성
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요. >> ");
		
		for ( int i =0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			
		}
		for(int i =0; i < intArray.length; i++) {
			sum	+= intArray[i];  //배열에 저장된 정수값 누적.
		}
		System.out.print("평균은 " + (double)sum/intArray.length);
		scan.close();
	}

}