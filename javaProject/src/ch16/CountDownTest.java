package ch16;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	private JLabel label;
	class MyThread extends Thread{//중첩클래스
		@Override
		public void run() {
			for(int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+" ");
			}		
		}
			//System.exit(0);//자동종료
		
	}//end 중첩클래스
	public CountDownTest(){
		setTitle("CountDown");
		setSize(1000, 700); //프레임 사이즈 설정

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 닫기 처리
		
		label = new JLabel("Count dowm Start!");
		label.setFont(new Font("Serif",Font.BOLD,80));
		add(label);
		(new MyThread()).start();//(생성자).start()

		setVisible(true);//화면을 보이게 설정
	
	}
	public static void main(String[] args) {
		//CountDownTest t = new CountDownTest();
		new CountDownTest();//참조변수를 쓸일이 없을땐 이처럼 생성자만 호출해서 객체 생성가능.

	}
}
