package review;

import javax.swing.JFrame;

public class JFrameRV extends JFrame{
//main메소드에서 GUI코드를 작성해도 되지만, Frame extends를 받아 기본생성자 안에서
//GUI코드 처리하는 것을 권장
	public JFrameRV() {
		super("JFrame 예제");//제목처리, 부모생성자 호출
//		setTitle("JFrame 예제제목");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JFrameRV();
	}
}
