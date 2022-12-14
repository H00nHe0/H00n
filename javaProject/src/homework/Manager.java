package homework;

public class Manager extends Employee{

public Manager() {
	
}	
public void print() {
	System.out.println("----------------------------");
	System.out.println("사원번호 : "+getNum());
	System.out.println("이름 : "+getName());
	System.out.println("주소 : "+address);
	System.out.println("이메일 주소 : "+email);
	System.out.println("연봉 : "+salary);
	System.out.println("주민번호 : "+getRrn());
	System.out.println();
	System.out.println("----------------------------");
}
}