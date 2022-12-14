package review;

public class Append {
	public static void main(String[] args) {
	
		
	String str = "Hoon";
	System.out.println(str);
	System.out.println(System.identityHashCode(str));
	str = str + " Heo";
	System.out.println(str);
	System.out.println(System.identityHashCode(str));
		//StringBuilder사용
	StringBuilder sb1 = new StringBuilder("Hoon");	
	System.out.println(sb1);
	System.out.println(System.identityHashCode(sb1));
		//변수.append()로 문자열 함침
	sb1.append(" Heo");
	System.out.println(sb1);
	System.out.println(System.identityHashCode(sb1));
	// 주소값 동일
	}
}
