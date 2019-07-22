package bankaccount_example;

public class BankCardAccount extends SimpleAccount {
	private BankCard cb;

	public BankCardAccount(String name, int balance, BankCard cb) {
		super(name, balance);
		this.cb=cb;
		// TODO Auto-generated constructor stub
	}

	public BankCardAccount(String name, float balance, int initialContribution, BankCard cb) {
		super(name, balance, initialContribution);
		this.cb=cb;
	}

	public boolean transfer(float amount, SimpleAccount account) {
		
		this.balance+= amount;
		account.balance-=amount;
		return true;
	
	
}

	@Override
	public String toString() {
		return "BankCardAccount [cb=" + cb + ", balance=" + balance + "]";
	}

	
}
