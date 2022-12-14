package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//AWT : java + c 개발(점차 없어지는 추세)
//Swing: AWT를 향상시킨 버전, java로만 개발
public class FrameExam {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 테스트");// Frame생성(윈도우 창)
		f.setSize(300, 400);//프레임 사이즈 설정
		f.setVisible(true);//false하면 숨김상태가 된다.
//		f.addWindowListener(new WindowListener() {//익명클래스로 이벤트핸들러처리
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);//프로그램 종료처리./정상종료:0,비정상종료:1
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//			}
//		});//익명클래스
		
		//Adapter를 사용하면 코드가 간략해진다.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
