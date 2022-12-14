package review;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.DomainCombiner;

import javax.swing.JFrame;

public class BorderExRV extends JFrame{
	public BorderExRV() {
		setTitle("BorderLayout 예제");
		setSize(500, 400);
		setVisible(true);
		
		//버튼생성
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		setLayout(new BorderLayout()); //보더레이아웃 frame생성/기본 레이아웃이어서 생략가능
		
		//버튼 컴포넌트를 borderLayout의 각 영역에 배치
		add(b1,"East");
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		add(b5,"Center"); //기본 위치는 center이어서 add(b5)도 가능
		
		//JFrame이 아닌 Frame을 상속받으면 윈도우 창 닫는 메소드 설정해야함.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
	new BorderExRV();
}	
}
