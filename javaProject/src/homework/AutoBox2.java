package homework;

public class AutoBox2 {
	public static void main(String[] args) {
		int num1 = 30;
		int num2;
		double num3 = 50.0;
		Integer i1;
		Integer i2 = new Integer(40);
		Integer i3;
		
		i1 = num1;
		num2 = i2;
		i3 = (int)(num3);
		System.out.println("기본 자료형 : "+ num1+" 객체 자료형 : "+i1);
		System.out.println("기본 자료형 : "+ num2+" 객체 자료형 : "+i2);
		System.out.println("기본 자료형 : "+ (int)(num3)+" 객체 자료형 : "+i3);
	}
}
