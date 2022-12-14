package homework;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		System.out.println("2건의 제품 정보를 입력하세요.");
		Product p1 = new Product(); p1.input();
		Product p2 = new Product(); p2.input();
		list.add(p1); list.add(p2);
		System.out.println("(단위:천원)");
		System.out.println("--------------------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t단가\t수량\t금액");
		System.out.println("--------------------------------------------------------");
		for(Product p : list) {
		System.out.println(p.getSerial()+"\t"+p.getpName()+"\t"+p.getCompany()+"\t"+p.getPrice()+"\t"+p.getAmount()+"\t"+p.getTot());
		}
	}
}
