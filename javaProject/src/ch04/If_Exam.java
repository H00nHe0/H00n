package ch04;

public class If_Exam {

	public static void main(String[] args) {

		int a = 19;
		if (a % 2 == 0) { // a를 2로 나눈 나머지가 0이면,
			System.out.println(a + "는 짝수입니다.");
		} //end if
		System.out.println("if문이 끝난이후 그 다음 명령문을 수행한다.");
	} // end main

} // end class
 // 조건문의 조건이 맞지 않으면 해당 수행문은 아예 출력되지 않음.