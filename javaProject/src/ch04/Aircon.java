package ch04;

public class Aircon {

	public static void main(String[] args) {

		int nowTem, setTem;
		nowTem =20;
		setTem = 18;
		
		if (nowTem > setTem) {
			System.out.println("에어컨 작동을 시작합니다.");
		}
		else {
			System.out.println("설정온도에 도달하여 에어컨을 끕니다.");
		}
	}

}
