package homework;

import java.text.DecimalFormat;

public class EC {
	private int no, pay;
	private String oderDate, product, cardName, cardNo;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPay() {
		DecimalFormat deciFor = new DecimalFormat("###,###");
		String p = deciFor.format(pay);
		return p;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getOderDate() {
		return oderDate;
	}
	public void setOderDate(String oderDate) {
		this.oderDate = oderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo.replace(cardNo.substring(5, 9), "****");
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public EC() {
		super();
	}
	public EC(int no, String oderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.pay =pay;
		this.oderDate = oderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
	}
	void print() {
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t\t카드명\t카드번호\t\t결제금액");
		System.out.println("-------------------------------------------------------------------------");
	}
}
