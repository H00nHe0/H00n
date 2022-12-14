package ch03;

public class CastEx {
//자료 형변환
	public static void main(String[] args) {
		float f = 1.6f; //float = 4 bytes로 저장
		System.out.println(f);
		
		f = 100; // 자동형변환(정수 100을 자동으로 float형으로 실수 100.0f로 변환.
		System.out.println(f);
		
		f = 100.5f;
		int i = (int)f; //강제 형변환. float -> int
		System.out.println(i);
	}

}
