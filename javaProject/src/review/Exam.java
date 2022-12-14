package review;

public class Exam {
	public static void main(String[] args) {
		String a = "hello";
		System.out.println(System.identityHashCode(a));
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b);
		
		String c = new String("hello");
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");
		System.out.println(System.identityHashCode(d));
		System.out.println(c == d);
		System.out.println(c.equals(d));
		
		}
	}

