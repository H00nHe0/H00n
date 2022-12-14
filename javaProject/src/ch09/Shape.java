package ch09;

public class Shape extends Object{
	//멤버변수
	private String name; // "Circle"

	public Shape() {
		super();// Object클래스의 기본생성자 호출
	}
	public Shape(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//일반 메소드
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
	
}
