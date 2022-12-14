package homework;

public class Person2 {
	private String name;
	private String eMail;
	private String address;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public void print() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("이메일 : "+ eMail);
		System.out.println("주소 : "+ address);
	}

}
