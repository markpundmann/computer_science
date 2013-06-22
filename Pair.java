public class Pair

{
	public Pair()
	{
		productname="";
		price=0;
	}

	public Product(String n, double p)
	{
		productname=n;
		price=p;
	}

	public String getName()
	{
		return productname;
	}

	public void reducePrice(double amount)
	{
		price=price*(100 - amount);
	}


	public String toString()
	{
		return productname+" that cost's $"+price;
	}


	private String productname;
	private double price;


	}

