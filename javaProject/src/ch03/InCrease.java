package ch03;

public class InCrease {

	public static void main(String[] args) {

		int i = 5;
		int j = 0;
		j = i++; //i의 값을 1증가. /후위연산자
		
		System.out.println(i + "," + j);
		
		i = 5;
		j = ++i;
		System.out.println(i + "," + j); // 전위 연산자.
	}

}
