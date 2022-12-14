package ch19;

import java.net.InetAddress;

public class InetAddressExam {

	public static void main(String[] args) {
		try {//네트워크 프로그램 필수 try~catch문
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
