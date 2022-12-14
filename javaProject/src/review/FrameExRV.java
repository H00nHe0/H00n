package review;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExRV {

	public static void main(String[] args) {
		Frame f = new Frame("프레임 테스트");
		f.setSize(300, 400); //프레임 사이즈 설정
		f.setVisible(true); //false하면 숨김상태
//		f.addWindowListener(new WindowListener() {//익명클래스로 이벤트 핸들러 처리
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
//				System.exit(0);//프로그램 종료처리
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//			}
//		});
		//WindoeAdapter를 사용하면 코드가 간략해 진다.
		f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
}
}