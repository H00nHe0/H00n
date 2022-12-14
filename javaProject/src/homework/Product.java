package homework;
import java.util.Scanner;

public class Product {
	private String serial;
	private String pName;
	private String company;
	private int price;
	private int amount;
	private int tot;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품번호 : ");
		serial = sc.next();
		System.out.print("제품명 : ");
		pName = sc.next();
		System.out.print("제조사 : ");
		company = sc.next();
		System.out.print("단가 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		amount = sc.nextInt();
		
		tot = price*amount;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTot() {
		return price*amount;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public Product() {
	}
}
