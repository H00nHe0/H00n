package review;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GridEx2RV extends JFrame{
	public GridEx2RV() {
		super("GridLayout 예제복습2");
	setLayout(new GridLayout(3,3));
	for(int i=1; i<=9; i++) {
		JButton jb = new JButton("Button"+i);
		add(jb);
	}
	setVisible(true);
	setSize(500, 500);
	
}
	public static void main(String[] args) {
		new GridEx2RV();
	}
}
