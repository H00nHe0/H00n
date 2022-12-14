package ch18;

import java.io.RandomAccessFile;

public class RandomFile {

	public static void main(String[] args) {
		String str = null;
		try { //r :읽기전용. w:쓰기 전용, rw: 읽기&쓰기
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw");
			//getFilePointer : 파일포인터(파일을 어디까지 읽었는지 가리킴) 
			System.out.println(file.getFilePointer());//0
			file.seek(8); //8번째 인덱스부터
			System.out.println(file.getFilePointer());//8
			file.write("HTML".getBytes());//인텍스 8번 위치에서 기존내용을 덮어쓰게 된다.
			System.out.println(file.length());//문자 길이 확인(한글은 3byte 길이값을 가짐)
			System.out.println(file.getFilePointer());
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str = file.readLine();
				//new String(무낮열, 캐릭터셋)인코딩 방식변환
				//한글처리
				//스트링.getBytes() - 스트링을 바이트 배열로 변환
				//8859_1 , iso-8859-1 :서유럽언어 인코딩방식
				//ms949 : 2byte
				//utf-8 : 3byte = 초성(1byte), 중성(1byte), 종성(1byte)
				str = new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//파일 저장시점
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
