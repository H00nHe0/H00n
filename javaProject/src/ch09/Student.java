package ch09;

public class Student {
	String name;
	String num;//학번
	String major; //전공
	int year;//학년
	public Student() {
		
	}
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	

}
