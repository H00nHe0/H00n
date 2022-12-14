package review;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatEx {
	public static void main(String[] args) {
	 //3자리 콤마표시
		//1) String활용
		int  n = 1234000000;
		String str = String.format("%,d", n);
		System.out.println(str);
		//2)DecimalFormat활용
		DecimalFormat df = new DecimalFormat("###,###.##");
		String dd = df.format(27584565351.940667);
		System.out.println(dd);
		NumberFormat nf = NumberFormat.getInstance()	;
		String num = nf.format(3248395747189.993694);
		System.out.println(num);
		
}
	
}
