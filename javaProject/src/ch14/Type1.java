package ch14;

public class Type1 {

	private int value;
	private double value1=0.0;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public double getValue1() {
		return value;
	}
	public void setValue1(double value) {
		this.value1 = value;
	}
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(100);
		System.out.println(t.getValue());
	}

}
