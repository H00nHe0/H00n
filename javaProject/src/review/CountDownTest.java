package review;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	private JLabel label;
	class MyThread extends Thread{
		@Override
		public void run() {
			for(int i = 10; i <= 110; i+=10) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText("집에 가고 싶다! x "+ i );
				if (i == 110) {
				label.setText("집에가야징~");
				}
			}		
		}
	}
	public CountDownTest(){
		setTitle("I want to go home..");
		setSize(1100, 800); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("집에 보내주세요..");
		label.setFont(new Font("Serif",Font.BOLD,80));
		add(label);
		(new MyThread()).start();
		setVisible(true);
	}
	public static void main(String[] args) {
		new CountDownTest();
	}
}
