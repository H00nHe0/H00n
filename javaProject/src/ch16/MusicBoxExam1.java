package ch16;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();// MusicBox인스턴스 생성
		
		MusicPlayer kim = new MusicPlayer(1, box); //BankPlayer 인스턴스생성(매개변수가 있는 생성자 사용.)
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		//BankPlayer 스레드 실행
		kim.start();
		lee.start();
		park.start();
	}

}
