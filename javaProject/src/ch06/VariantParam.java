package ch06;

public class VariantParam {
	
	public static void main(String[] args) {
		print("Java");
		print("Java", "Program");
		print("Java", "Program", "JSP");
		print("Java", "Program", "JSP", "Big", "Data");
	}
	static void print(String ...n) {
		for (int i =0; i<n.length; i++) { //n이 가변형 매개변수
			System.out.println(n[i]);
		}
	}

//	static void print(String a, String b, String c, String d, String e) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//	}
//
//	static void print(String a, String b, String c) {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//	}
//
//	static void print(String a) {
//		System.out.println(a);
//	}
//
//	static void print(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
//	}

}
