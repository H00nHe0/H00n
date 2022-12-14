package ch12;
abstract class Action{
	public abstract void exec();
}
public class ActionExam extends Action{

	@Override
	public void exec() {
		System.out.println("I'm child");
	}
	public static void main(String[] args) {
		Action a = new ActionExam() { //익명내부 클래스
			String name = "Kim";
			@Override
			public void exec() {
				System.out.println("나는 " + name + " 이다.");
			}
		}; //익명내부클래스의 마지막 중괄호 다음에는 세미콜론(;)이 명시되어야 한다.
		a.exec();
	
	}
}
