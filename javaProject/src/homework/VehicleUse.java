package homework;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v1 = new Plane();
		v1.speedUp();
		v1.speedDown();
		v1.handling();
		System.out.println();
		v1 = new Boat();
		v1.speedUp();
		v1.speedDown();
		v1.handling();
	}
}
