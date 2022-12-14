package review;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx1RV extends JFrame{
	public GridEx1RV() {
		super("GridLayout 예제복습");
		setLayout(new GridLayout(2,3)); //2행 3열의 그리드 레이아웃 설정
		JButton b1 = new JButton("버튼1"); //버튼 생성
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		JButton b5 = new JButton("버튼5");
		JButton b6 = new JButton("버튼6");
		add(b1);//그리드 레이아웃에 버튼추가
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridEx1RV()	;
		
	}
}
