import javax.swing.JOptionPane;
public class StringSorterTester
{
	public static void main(String[] args)
	{

		String x1=JOptionPane.showInputDialog("Please input String 1");

		String x2=JOptionPane.showInputDialog("Please input String 2");

		String x3=JOptionPane.showInputDialog("Please input String 3");

		String x4=JOptionPane.showInputDialog("Please input String 4");

		StringSorter emp1=new StringSorter(x1, x2, x3, x4);

		System.out.println("The first one in the order is "+emp1.getSmallest());
		System.out.println("The last one in order is "+emp1.getLargest());


	}
}
