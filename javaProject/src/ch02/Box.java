package ch02;

public class Box {

	public static void main(String[] args) {

		double width = 10.0;
		double vertical = 5.0;
		
		double wide = width * vertical;
		double perimeter = 2.0 * (width + vertical);
		
		System.out.println("================================");
		System.out.println("사각형의 넓이 : " + wide);
		System.out.println("사각형의 둘레 : " + perimeter);
		System.out.println("================================");
	}

}
