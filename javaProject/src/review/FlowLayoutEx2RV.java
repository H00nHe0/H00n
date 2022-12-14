package review;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2RV extends JFrame{
	//멤버변수 선언
	JPanel jp;
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public FlowLayoutEx2RV() {
		super("FlowLayout 예제2복습");
		jp = new JPanel(); //패널생성
		jb1 = new JButton("버튼 1");
		jb2 = new JButton("버튼 2");
		jb3 = new JButton("버튼 3");
		jb4 = new JButton("버튼 4");
		jb5 = new JButton("버튼 5");
		jp.add(jb1);//패널에 버튼 추가
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		add(jp, "South");
		add(jb5);
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new FlowLayoutEx2RV();
	}
	
}
