package ch09;

public class CircleShape extends Shape {
	private int radius; //5
	//getter,setter

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	//매개변수가 있는 생성자
	public CircleShape(int radius) { //5
		super("Circle");//부모생성자(매개변수가 있는) 호출
		this.radius = radius;
	}
	//부모 클래스의 멤버메소드 오버라이딩
	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}	
	@Override
	public void draw() {
		System.out.print("반지름이 "+ radius + "인 원 ");
		super.draw();
	}
}
