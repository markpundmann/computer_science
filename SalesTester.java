public class SalesTester
{
	public static void main(String[] args)
	{
		double[][] array1={{3,5},{1,2,3}};

		Customer st1cust=new Customer("Mary Jones", 123, array1);

		Store store1=new Store(11122, st1cust);

		store1.calcSales();

		System.out.println(store1.getSales());








	//run with Store.java   and Customer.java
	}
}