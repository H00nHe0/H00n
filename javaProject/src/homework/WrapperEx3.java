package homework;

public class WrapperEx3 {

	public static void main(String[] args) {
		
		String str = new String("Hello 1234");
		char[] ch = str.toCharArray(); 
		String st = Integer.valueOf(str.substring(6))+"";
		int e = Integer.parseInt(str.substring(7,8));
		
		System.out.println("----------------------------------------");
		for(int i = 0; i <ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				System.out.println(ch[i]+ "는 대문자 입니다.");
			}else if (Character.isLowerCase(ch[i])) {
				System.out.println(ch[i]+ "는 소문자 입니다.");
			}else if(Character.isDigit(ch[i])) {
				System.out.println(ch[i]+ "는 숫자 입니다."); 
				} 
		}System.out.println("(Integer 사용)");
		System.out.println("문자 "+st+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str.substring(6))+"입니다.");
		System.out.println("숫자 "+Integer.parseInt(str.substring(6))+
				"+"+e+"="+(Integer.parseInt(st)+e)+"입니다.");
		System.out.println("----------------------------------------");
	}
}
