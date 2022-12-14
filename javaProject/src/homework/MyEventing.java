package homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JLabel;

public class MyEventing extends JApplet implements MouseListener,MouseMotionListener,KeyListener{
	private int x,y;
	private int width, height;
	private Image img;
	private boolean flag = false;
	
	@Override
	public void init() {
		JLabel j = new JLabel("Pokemon World", JLabel.CENTER);
		j.setFont(new Font("굴림", Font.ITALIC, 60));
		add(j);
		setSize(1200, 1000);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("liza.gif"));
		//현재 클래스에 마우스 이벤트 기능을 추가(중요코드)	
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		
		//키입력을 받을 수 있도록 설정
		setFocusable(true);
		//현재 화면에 키 입력 요청
		requestFocus();
	}
	@Override
	public void paint(Graphics g) {//화면출력용
		super.paint(g);
		//이미지의 가로,세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+" , "+height);
		//drawImage(이미지,x,y,이미지 관찰자)
		if(flag) {//마우스를 클릭하면 true가 됨
			g.drawImage(img, x, y, this);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}//키를 입력하면 호출

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//키 문자값
		
		//max(값,값) 또는 min()는 앞의 값과 뒤의 값 중 최대값,최소값
		//이미지가 프레임 바깥으로 안빠져나감.
		switch (e.getKeyCode()) {//키 코드값에 따라 분기
		case KeyEvent.VK_UP://위쪽 키를 누르면,
			y = Math.max(0, y-5);break;
		case KeyEvent.VK_DOWN:	//아래쪽 키를 누르면,
			y = Math.min(1200-height, y+5); break;
		case KeyEvent.VK_LEFT://왼쪽 키를 누르면,
			x =Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT://오른쪽 키를 누르면,
			x = Math.min(1000-width, x+5);break;
		}
		repaint(); //그래픽 갱신요청
	}//키가 눌려져 있을때 호출

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	//컴퍼넌트 상에서 mouse버튼을 누른상태에서 드래그 했을때 호출
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x :"+x+" , y :"+y);
	}
	
	//마우스 커서가 컴퍼넌트 상에 이동했지만 버튼이 작동않은 경우에 호출
	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move : x :"+x+" , y :"+y);
		repaint();
	}
	
	//컴포넌트 상에서 마우스 버튼을 클릭(눌렀다가 놓을 때)했을때에 호출.
	@Override
	public void mouseClicked(MouseEvent e) {
		flag = true;//클릭할때 true처리.(이미지가 보이게 함)
		//마우스 클릭한 좌표 저장
		x = e.getX();// x좌표값 저장
		y = e.getY();// y좌표값 저장
		//그래픽 갱신 요청 -> paint()를 자동호출
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}//컴포넌트 상에서 마우스 버튼을 눌렀을 때 호출

	@Override
	public void mouseReleased(MouseEvent e) {
	}//마우스 버튼을 완전히 놓을 때 호출

	@Override
	public void mouseEntered(MouseEvent e) {
	}//마우스가 컴퍼넌트에 들어 갔을 때에 호출

	@Override
	public void mouseExited(MouseEvent e) {
	}//마우스가 컴퍼넌트를 종료하면 호출.
	
	
	
}
