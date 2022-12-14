package review;

public class AutoBox {
	public static void main(String[] args) {
		
	
//기본 자료형
	int num = 10;
	int num1;
	//참조 자료형
	Integer i1 = new Integer(1);
	Integer i2; //선언만 했을때 i2의 값은 null상태
	i2 = num; //기본자료형인 int와 참조자료형인 Integer는 호환.
	num1 = i1;//auto unboxing
	
	System.out.println(num +" "+ i2);
	System.out.println(num1 + " "+ i1 );
	}
	
}
