package homework;

public class MyBank{
//공유객체
	private String hong = "홍길동";
	private String sa = "사임당";
	private String lee = "이몽룡";
	Thread th = new Thread();
	public synchronized void myBankA() {
		for(int i = 0; i < 5; i++) { 
			System.out.println(hong+" 님의 통장잔고는" + (i+1)*10 +"만원 입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void myBankB() {
		th.setPriority(5);
		for(int i = 0; i < 5; i++) {
			System.out.println(sa +" 님의 통장잔고는" + (i+2)*10 +"만원 입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void myBankC() {
		th.setPriority(1);
		for(int i = 0; i < 5; i++) {
			System.out.println(lee+" 님의 통장잔고는" + (i+3)*10 +"만원 입니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}