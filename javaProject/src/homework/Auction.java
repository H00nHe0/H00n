package homework;

public class Auction {
	private String name;
	private String id;
	private String grade;
	private int pay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		if (pay >= 100000) {
			grade = "gold";
		}else if (pay < 100000) {
			grade = "silver";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t"+"  "+"등급");
		System.out.println(name+"\t"+id+"\t"+pay+"\t"+"  "+getGrade());
	}
	
	
}
