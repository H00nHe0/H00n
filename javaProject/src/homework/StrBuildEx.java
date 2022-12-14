package homework;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("I am a ");
		StringBuilder str2 = new StringBuilder("Java Programmer");
		StringBuilder str3 = str1.append(str2);
		System.out.println("-------------------------------------------------");
		System.out.println("append() 메소드를 활용 :"+"\""+str3+"\"");
		System.out.println("replace() 메소드를 활용 :"+"\""+str3.replace(7, 11, "JSP")+"\"");
		System.out.println("substring()을 활용 :"+"\""+str3.substring(7)+"\"");
		System.out.println("-------------------------------------------------");
	}
}
