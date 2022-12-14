package ch08;

class Circle{
	double radius;
	String color;
	public Circle(double r, String c) { //r =10.0 ,c = "빨강"
		radius = r;
		color = c;
	}
	public Circle(double r) { //r = 5.0
		radius = r;
		color = "파랑";
	}
	public Circle(String c) { //c = 노랑
		radius = 21.0; 
		color = c;
	}
	public Circle() {
		radius = 3.5; 
		color = "빨강";
	}
	//출력용도
	public void print() {
		System.out.println("반지름 : "+radius);
		System.out.println("색 깔 : "+color);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강");
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("노랑");
		c3.print();
		
		Circle c4 = new Circle();
		c4.print();
	}
}
