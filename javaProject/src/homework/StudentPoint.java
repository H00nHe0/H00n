package homework;

public class StudentPoint {
	static String[] name = {"홍길동", "사임당", "이순신"};
	static int[] java = {90, 95, 84};
	static int[] db = {85, 79, 92};
	static int[] html = {99, 88, 95};
	static int[] jsp = {76, 92, 72};
	static double[] avg = {0.0, 0.0, 0.0};
	static int tot[] = {0,0,0};
	static int[] num = {0,0,0}; 
	
	public static void main(String[] args) {
		stuNum();
		getTot();
		getAvg();
		print();
	}
	static void stuNum() {
		for (int i =0; i < 3; i++) {
			num[i] = 1001+i;
		}
	}
	
	static void getTot() { //총점계산
		for ( int i = 0; i < 3; i++) {
			tot[i] = java[i] + db[i] + html[i] + jsp[i];
		}
	}
	static void getAvg() {//평균 계산
		for (int i =0; i< 3; i++) {
			avg[i] = tot[i]/4.0;
		}
}
	static void print() {//출력 용
		System.out.println(" 전체 학생수 : "+ name.length + "명");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		for(int i =0; i < 3; i++) {
			System.out.println(num[i]+"\t"+name[i]+"\t" + java[i]+"\t" +db[i]+"\t" + html[i]+"\t"+jsp[i]+"\t"+tot[i]+"\t" + String.format("%.1f", avg[i]));
	}
	}
}