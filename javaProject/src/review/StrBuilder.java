package review;

public class StrBuilder {
public static void main(String[] args) {
	StringBuilder str = new StringBuilder();
	str.append("hoon");
	System.out.println(str);
	System.out.println(str.toString());
	str.append(" is doing well.");
	System.out.println(str);
	String str1 = str.substring(4);
	System.out.println(str1);
}
}
