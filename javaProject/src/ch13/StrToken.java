package ch13;

import java.util.StringTokenizer;
//문자열을 특정기호를 기준으로 나누어 리턴하는 2가지 방법.

public class StrToken {
	public static void main(String[] args) {
		String str = "Kim,20,180,55,서울,학생";
		String[] items = str.split(",");//콤마를 기준으로 데이터 분리.
		for (String s : items) {//향상된 for문(for-each)
			System.out.println(s);
		}
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens(); //토큰의 갯수
		System.out.println("토큰의 갯수 : "+cnt);
		while(st.hasMoreElements()) { //다음 토큰이 있을 때까지 반복
			System.out.println(st.nextToken());// 토큰 하나를 가져와 리턴
		}
	}
	

}
