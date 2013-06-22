public class BankAccount
{
	public BankAccount()
	{
		balance=0;
	}

	public BankAccount(double initBalance)
	{
		balance=initBalance;
	}

	public void deposit(double amount)
	{
		balance=balance+amount;
	}

	public void withdraw(double amount)
	{
		balance=balance-amount;
	}

	public double getBalance()
	{
		return balance;
	}

	public void addInterest(double amount)
	{
		balance=balance*(1 + amount/100);
	}

	private double balance;

}