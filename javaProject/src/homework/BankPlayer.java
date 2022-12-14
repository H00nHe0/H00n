package homework;

public class BankPlayer extends Thread{
	int bank;
	MyBank myBank;
	
	public BankPlayer(int bank, MyBank myBank) {
		this.bank = bank;
		this.myBank = myBank;
	}
	@Override
	public void run() {
		
		switch (bank) {
		case 1: myBank.myBankA();break;
		case 2: myBank.myBankB();break;
		case 3: myBank.myBankC();break;
		}
	}
}
