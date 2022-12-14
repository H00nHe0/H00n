package homework;

public class NotebookUse {

	public static void main(String[] args) {
		NbController n = new Notebook();
		n.turnOn();
		n.turnOff();
		n.repair();
		n.reset();
		System.out.println("=====static,default사용=======");
		n.turnOn1();
		NbController.turnOff1();
		n.repair1();
		NbController.reset1();
	}
}
