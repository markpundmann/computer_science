import javax.swing.JOptionPane;

public class ProductTester
{
	public static void main(String[] args)
	{
		Product emp1 = new Product("Toaster", 20);

		Product emp2 = new Product("Pan", 100);

		System.out.println(emp1.toString());

		System.out.println(emp2.toString());

		String sPercent1=JOptionPane.showInputDialog("Please input % discount for the toaster");

		double dPercent1=Double.parseDouble(sPercent1);

		emp1.reducePrice(dPercent1);

		System.out.println(emp1.toString());




	}
}
