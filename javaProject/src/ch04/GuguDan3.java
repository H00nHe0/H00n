package ch04;

public class GuguDan3 {

	public static void main(String[] args) {
		int dan = 2;
		int d =1;
		
		while (dan <= 9) {
			while ( d <= 9) {
			System.out.print(dan +"*"+ d + "=" + (dan*d)+"\t");
			d++;
		}
		d = 1;
		dan++;
		System.out.println();
}
}
}