package ch03;

public class StringExam {

	public static void main(String[] args) {
		String str = "Hello " + "java"; // 문자열에서 +는 연결의 의미.
		System.out.println(str);
		str = 123 + "C"; //숫자 + 문자열
		System.out.println(str);
		
		str += "Programmer"; // str = str + "Prigrammer"
		System.out.println(str);
	}

}
