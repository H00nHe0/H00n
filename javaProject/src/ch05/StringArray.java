package ch05;

public class StringArray {

	public static void main(String[] args) {

		String[] str = {"Java", "DB", "JSP", "HTML"};
		//정식문법으로 바꿔보기!.
		
		for(int i =0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();	
		//확장 for문(향상된 for문, for ~ each문) => jdk 1.5이상부터 사용가능
		//for(개별값 저장변수 : 집합변수) {}
		for(String ss : str) {
			System.out.println(ss);
		}
	}
}
