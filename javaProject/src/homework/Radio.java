package homework;

public class Radio {
	double channel; //채널
	int volume; // 볼륨
	boolean onOff;//전원
	String radioName;
	
	void printa() {
		System.out.println("["+radioName+" 라디오]");
			if (onOff == true) {
				System.out.println("라디오가 켜져있습니다."); 
				}else{
				System.out.println("라디오가 꺼져있습니다.");
			}
		System.out.println("현재 채널은 " + channel + " 입니다.");
		System.out.println("불륨은 " + volume +"입니다.");
	}
	
	
}
