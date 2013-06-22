public class Store
{
	public Store()
	{
		totalSales=0;
	}

	public Store(int sn, Customer c)
	{
		storeNum=sn;
		storeCustomer=c;
		totalSales=0;
	}

	public void calcSales()
	{
		double[][] w=storeCustomer.getPurchases();
		totalSales=0;
		for(int i=0; i<w.length; i++)
			for(int x=0; x<w[i].length; x++)
				totalSales+=w[i][x];
	}

	public double getSales()
	{
		return totalSales;
	}


	private int storeNum;
	private Customer storeCustomer;
	private double totalSales;
	//run with Customer.java    and SalesTester.java
}