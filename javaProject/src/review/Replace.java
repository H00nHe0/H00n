package review;

public class Replace {
public static void main(String[] args) {
	String a = "java program";
	System.out.println(a.replace("a", "e"));
	System.out.println(a);
	a = a.replace("a", "e");
	System.out.println(a);
}
}
