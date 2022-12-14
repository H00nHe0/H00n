package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax_Try {
	public static double valueOfSupply;
	public static int vatRate = 10;
	
	public static double getVat() {
		return (valueOfSupply /vatRate);
	}
	public static double getTotal() {
		return valueOfSupply + getVat();
	}
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.print("공급가액을 입력하세요 : ");
		ValueAddedTax_Try.valueOfSupply = Integer.parseInt(sc.nextLine());
		try {
		System.out.println("***************************");
		System.out.println("공급가액 : "+ decFormat.format((int)valueOfSupply)+"원");
		System.out.println("부가가치 세율 : "+vatRate+ "%");
		System.out.println("부가가치세 : "+ decFormat.format((int)getVat())+"원");
		System.out.println("합계 : "+decFormat.format(getTotal())+"원");
		System.out.println("***************************");
		}
		 catch (Exception e) {
				System.out.println("프로그램 실행중 문제가 발생하여 ");
				System.out.println("이후 문장이 실행되지 않습니다. 프로그램을 종료합니다.");
				System.exit(0);
			}
		sc.close();
	}
}
