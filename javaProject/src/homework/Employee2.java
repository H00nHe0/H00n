package homework;

public class Employee2 {
	private String name;
	private String depart;
	private String position;
	private int basic;
	private int bonus;
	private int total;
	private double tax;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public void calc() {
		bonus = basic*3;
		total = basic + bonus;
		tax = (int)(total*0.033);
		salary = (int)(total - tax);
	}
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실 수령액");
		System.out.println(name+"\t"+depart+"\t"+position+"\t"+basic+"\t"+bonus+"\t"+total+"\t"+(int)tax+"\t"+salary);
	}
	
}
