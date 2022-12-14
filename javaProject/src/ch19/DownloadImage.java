package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.omg.CORBA.portable.OutputStream;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		String website = "https://ssl.pstatic.net/melona/libs/1416/1416266/d301d9ffe131c16d78c8_20221202184540535.jpg";
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website);
		//byte 배열
		byte[] buffer = new byte[2048];//버퍼용 바이트 배열[2mb]
		//try~with문 (Java 1.7부터 도입)
		//finally가 없어도 리소스를 자동으로 종료시킴
		//try(리소스 선언부){
		//}catch(Exception e){
		//}
		try(InputStream in = url.openStream(); FileOutputStream out = new FileOutputStream("c:\\test\\test.jpg")){
			int length= 0; //length 읽은 바이트수 리턴
			//더이상 읽을 내용 없으면 -1
			while((length = in.read(buffer)) != -1) {//읽을 내용이 있으면
				System.out.println(length+"바이트 읽음.");
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료 되었습니다.");
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
