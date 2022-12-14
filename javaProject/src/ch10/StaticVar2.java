package ch10;

public class StaticVar2 {
	static int total; //static 메모리 영역에 바로 로딩
	String model;// non static은  heap영역에 생성됨

	public StaticVar2(String model) {//매개변수가 있는 생성자.
		this.model = model;
		total++;
	}
}
