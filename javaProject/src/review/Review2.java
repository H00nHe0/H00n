package review;

public class Review2 {
	public static void main(String[] args) {
		Review r1 = new Review();

		r1.setName("상승곡선");
		r1.setAuthor("허훈");
		r1.setPress("진실과 거짓");
		r1.setPrice(20000);
		r1.setYear(2022);
		r1.setAmount(50);
		
		r1.print();
	}
}
