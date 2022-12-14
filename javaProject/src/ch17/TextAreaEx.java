package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	//멤버변수
	private JTextField tf = new JTextField(20);//한줄 입력창 생성
	private JTextArea ta = new JTextArea(6, 20);//6행 20열의 입력창 생성

	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+ "\n");
				t.setText(" ");
			}
		});
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
	
}