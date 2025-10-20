package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("김자바","1234567");
		System.out.println(account.getBalance());
		
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		
		int finalAmount = account.withdrawal(5000);
		System.out.println(finalAmount);
		
		finalAmount = account.withdrawal(7000);
		System.out.println(finalAmount);
		System.out.println(account.getBalance());
		
		System.out.println(BankAccount.getCount());
		BankAccount account2 = new BankAccount("이파이","122345212345");
		System.out.println(BankAccount.getCount());
	}

}
