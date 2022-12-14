package ch09;

public class Area {
	//멤버변수
	private int width;// 멤버변수의 경우 기본적으로 초기화가 되어있다.
	private int length;
	//생성자
	public Area() { }
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	//getter,setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//일반 메소드
	public int getArea() {
		return width * length;
	}
	
}
