package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Scanner;

public class EventEx extends Frame implements WindowListener {
	public EventEx() {
		addWindowListener(this); //WindowListener를 상속받아 쓰면(this)로도 사용가능
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx();
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	
}
