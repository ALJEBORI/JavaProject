package bankaccount_example;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAccount mysimple = new SimpleAccount("Moh", 100f, 1);
		VipAccount myVip = new VipAccount("MohVip", 1f, 1);
		BankCardAccount myBankCard = new BankCardAccount("MohCard", 200f, 1, BankCard.VISAPREMIER);
		if (mysimple.credit(200))
			System.out.println("Operation success");
		else
			System.out.println("Operation failed");

		if (mysimple.debit(400))
			System.out.println("Operation success");
		else
			System.out.println("Operation failed");
		if (myVip.credit(200))
			System.out.println("Operation success");
		else
			System.out.println("Operation failed");

		if (myVip.debit(400))
			System.out.println("Operation success");
		else
			System.out.println("Operation failed");

	}

}
