package homework;

public interface NbController {
	void turnOn();
	void turnOff();
	void repair();
	void reset(); 
	
	default void turnOn1() {
		System.out.println("노트북을 켠다.");}
	static void turnOff1() {
			System.out.println("노트북을 끈다.");}
	default void repair1() {
		System.out.println("장비를 수리한다.");}
	static void reset1() {
		System.out.println("장비를 초기화 한다.");}
}
