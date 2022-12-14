package homework;

public class BankUse {

	public static void main(String[] args) {
		MyBank account = new MyBank();
		
		BankPlayer hong = new BankPlayer(1, account);
		BankPlayer sa = new BankPlayer(2, account);
		BankPlayer lee = new BankPlayer(3, account);

		hong.start();
		sa.start();
		lee.start();
	}

}
