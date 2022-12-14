package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char lastName = '\uD5C8';
		char firstName = '\uD6C8';
		
		int num1 = lastName;
		int num2 = firstName;
		
		
		System.out.println("====================");
		System.out.println("허 훈");
		System.out.println("char형('\\uD5C8'): " + lastName);
		System.out.println("char형('\\uD6C8'): "  + firstName );
		System.out.println("====================");
		
		
		
	}

}
