package ch02;

public class CircleArea {

	public static void main(String[] args) {

		final double PI = 3.14;
		double radius = 10.0;
		
		double area = (radius*radius) * PI;
		
		System.out.println("====================");
		System.out.println("원의 면적 = " + area);
		System.out.println("====================");
		
	}

}
