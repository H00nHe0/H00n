package ch09;

public class SportCarTest {
	public static void main(String[] args) {
		SportCar obj = new SportCar();//자식클래스만 인스턴스화.
		obj.speed = 10;//speed는 Car라는 부모클래스 멤버
		//SportCar 객체는 Car객체를 상속 받았기 때문에 부모격인 Car객체의 멤버들(멤버변수,멤버메소드)를
		//모두 사용할 수 있다.
		//부모꺼는 내꺼
		obj.setSpeed(60);
		obj.setTurbo(true);
		
	}
}
