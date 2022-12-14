package review;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {

	public GUI() {
		setTitle(" 안녕 , 스윙!");
		setSize(800, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JButton j1 = new JButton("버튼1");
		JButton j2 = new JButton("버튼2");
		JButton j3 = new JButton("버튼3");
		p.add(j1);p.add(j2);p.add(j3);
		add(p); 
		//pack();
		
	}
public static void main(String[] args) {
	new GUI();
}

}
