package ch11;

public interface Controllable {
	//인터페이스에서 명시적 default 메소드로의 구현은 jdk8부터 가능하다.
	//원래는 인터페이스에서는 추상메소드,상수만 사용가능.
	default void repair() {
		System.out.println("장비를 수리한다.");
	}
	static void reset() {//static메소드 구현도 default처럼 jdk8부터 가능하다.
		System.out.println("장비를 초기화 한다.");
	}
	//참고: private 메소드 구현은 jdk9부터 사용가능.
	//실무에서는 아직 인터페이스에서 위와같은 구현메소드 사용안함.
	void turnOn();
	void turnOff();

}
