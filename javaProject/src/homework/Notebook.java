package homework;

public class Notebook implements NbController {
	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}
	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}
	@Override
	public void repair() {
		System.out.println("장비를 수리한다.");
	}
	@Override
	public void reset() {
		System.out.println("장비를 초기화 한다.");
	}
}
