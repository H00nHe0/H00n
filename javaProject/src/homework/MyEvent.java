package homework;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MyEvent extends JFrame{
	private JButton button1,button2,button3,button4;
	public MyEvent() {
		
	button1 = new JButton("Red");button2 = new JButton("Green");
	button3 = new JButton("Blue");button4 = new JButton("Yellow");
	
	add(button1,"North");add(button2,"East");add(button3,"South");
	add(button4,"West");
	
	button1.addActionListener(new MyEventColor(this, Color.red));
	button2.addActionListener(new MyEventColor(this, Color.green));
	button3.addActionListener(new MyEventColor(this, Color.blue));
	button4.addActionListener(new MyEventColor(this, Color.yellow));
	
	setSize(500, 400);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyEvent();
	}
}
