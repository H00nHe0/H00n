package ch07;

public class Television {
	//멤버변수 , 필드변수
	int channel; //채널
	int volume; // 볼륨
	boolean onOff;//전원
	
	void print() {
		System.out.println("채널은 " + channel + "이고, 불륨은 "+ volume + "입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
