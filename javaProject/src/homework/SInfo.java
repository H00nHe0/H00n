package homework;

public class SInfo implements Student {
	String name = "홍길동";
	String eMail = "hong@gmail.com";
	String address;
	int total;
	double avg;
	
	public SInfo() {}
	@Override
	public void address() {
		address = "서울 강남구";
	}
	@Override
	public void point() {
		total = KOR + ENG + MAT; 
	}
	public void calc() {
		avg = total/3.0;
	}
	public void print() {
		System.out.println("=============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+address+"\t"+eMail);
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf(name+"\t"+KOR+"\t"+ENG+"\t"+MAT+"\t"+total+"\t"+"%.1f\n",avg);
		System.out.println("=============================================");
	}
	

}
