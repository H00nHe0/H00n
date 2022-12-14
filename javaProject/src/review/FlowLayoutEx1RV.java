package review;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1RV extends JFrame{
	public FlowLayoutEx1RV() {
		setTitle("FlowLayout 기본예제 복습");
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//원래 JFrame,Frame의 기본레이아웃은 BorderLayout이다.
		//FlowLayout으로 레이아웃 변경시는 아래처엄
		setLayout(new FlowLayout());
		//레이아웃에 버튼생성 및 추가
		add(new JButton("안"));
		add(new JButton("녕"));
		add(new JButton("하"));
		add(new JButton("세"));
		add(new JButton("요"));
	}
	public static void main(String[] args) {
		new FlowLayoutEx1RV();
	}
}
