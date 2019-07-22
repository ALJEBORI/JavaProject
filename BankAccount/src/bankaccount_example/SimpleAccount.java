package bankaccount_example;

public class SimpleAccount {
	private static int comission=1;
	private String name;
	protected float balance;
	private int number;
	public SimpleAccount(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public SimpleAccount(String name, float balance, int initialContribution) {
		this.name = name;
		this.balance = balance;
		this.number = initialContribution;
	}
	
	public boolean credit(float amount) {
		this.balance+=amount;
		return true;
	}
	public boolean debit(float amount) {
		if(this.balance<=amount) {
			return false;
		} else {
			this.balance-=(amount+comission);
			return true;
		}
	}
	public boolean transfer(float amount, SimpleAccount account) {
		if((account.balance)<=amount) {
			return false;
		}
		else {
			this.balance+=amount;
			account.balance-=(amount+comission);
			return true;
		}
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "SimpleAccount [name=" + name + ", balance=" + balance + ", number=" + number + "]";
	}
	
}
