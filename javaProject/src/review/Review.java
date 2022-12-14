package review;
public class Review {
	private String name;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int totMoney;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getTotMoney() {
		totMoney = amount*price;
		return totMoney;
	}
	public void setTotMoney(int totMoney) {
		this.totMoney = totMoney;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void print() {
		System.out.println("책이름\t저자\t출판사\t\t연도\t가격\t판매량\t수익");
		System.out.println(name+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+getTotMoney());
	}
	
	
	
	}
