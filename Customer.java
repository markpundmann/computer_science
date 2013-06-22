public class Customer
{
	public Customer()
	{
		name="";
		idNum=0;
	}

	public Customer(String n, int id, double[][] p)
	{
		name=n;
		idNum=id;
		purchases=p;
	}

	public Customer(double[][] p)
	{
		purchases=p;
	}

	public double[][] getPurchases()
	{
		return purchases;
	}

	private String name;
	private int idNum;
	private double[][] purchases;
	//run with Store.java    and SalesTester.java
}