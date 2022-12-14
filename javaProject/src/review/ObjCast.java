package review;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		Object obj = 20;
		a = (Integer)obj;
		System.out.println(a);
		Object[] obj2 = {10,20.4,"java",'a'};
		System.out.println(obj2);
		for(Object o : obj2) {
			System.out.println(o);
		}
	}

}
