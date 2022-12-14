package ch09;

public class Ball extends Circle {
	private String color; //Ball class의 멤버
	public Ball(String color) {//매개변수가 있는 생성자
		this.color = color;
	}
	public Ball() {
		
	}
	public void findColor() {//Ball class의 멤버
		System.out.println(color + " 공이다.");
	}
	public void findVolume() {//Ball class의 멤버
		System.out.println("부피 구하기");
	}
}
