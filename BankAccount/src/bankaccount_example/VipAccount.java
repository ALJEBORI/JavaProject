package bankaccount_example;

public class VipAccount extends SimpleAccount {
 
	public VipAccount(String name, float balance, int initialContribution) {
		super(name, balance, initialContribution);
		// TODO Auto-generated constructor stub
	}

	public VipAccount(String name, int  number) {
		super(name,number);
		// TODO Auto-generated constructor stub
	}
	public boolean transfer(float amount, SimpleAccount account) {
		
			this.balance+= amount;
			account.balance-=amount;
			return true;
	}

	
	@Override
	public boolean debit(float amount) {
		// TODO Auto-generated method stub
			this.balance-=amount;
			return true;
	}

	@Override
	public String toString() {
		return "VipAccount [balance=" + balance + "]";
	}



	
}
