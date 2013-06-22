public class BankAccountTester
{

	public static void main(String[] args)
	{
		BankAccount account1=new BankAccount();

		System.out.println(account1.getBalance());

		account1.deposit(1000);

		System.out.println(account1.getBalance());

		account1.withdraw(400);

		System.out.println(account1.getBalance());

		account1.addInterest(10);

		System.out.println(account1.getBalance());

	}


}