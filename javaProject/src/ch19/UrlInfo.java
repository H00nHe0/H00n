package ch19;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlInfo {
	//URL : url정보를 분석하는 클래스
	public static void main(String[] args) {
		try {
			
			URL url = new URL("https://shopping.naver.com/foreign/stores/100415732/products/7239939885?NaPm=ct%3Dlblkw7ov%7Cci%3Dshoppingwindow%7Ctr%3Dswl%7Chk%3D4781e7e1b6a8a7415c11aca0d386ae3ade539c2b%7Ctrx%3D");
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("포트 : "+url.getPort());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("파일 : "+ url.getFile());
		System.out.println("기타 : "+url.toExternalForm());
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
