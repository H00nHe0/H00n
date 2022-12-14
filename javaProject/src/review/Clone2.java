package review;

public class Clone2 implements Cloneable{
	int num = 10;
	void print () {
		System.out.println("num : "+ num);
	}
	public static void main(String[] args) {
		Clone2 t1 = new Clone2();
		Clone2 t2 = null;
		try {
			t2 = (Clone2)t1.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
