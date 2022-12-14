package homework;

public class RadioTest {

	public static void main(String[] args) {
		
		Radio britz = new Radio();
		britz.radioName = "브리츠";
		britz.onOff = true;
		britz.channel = 89.1;
		britz.volume = 12;
		
		britz.printa();
		System.out.println();
		
		Radio iRiver = new Radio();
		iRiver.radioName = "아이리버";
		iRiver.onOff = false;
		iRiver.channel = 95.1;
		iRiver.volume = 9;
		
		iRiver.printa();
	}

}
