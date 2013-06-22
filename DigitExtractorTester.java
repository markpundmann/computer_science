import javax.swing.JOptionPane;
public class DigitExtractorTester
{
	public static void main(String[] args)
	{

		String a=JOptionPane.showInputDialog("Please input your number");

		int b = Integer.parseInt(a);


		DigitExtractor emp1 = new DigitExtractor(b);

		System.out.println(emp1.getNumbers());
		System.out.println(emp1.getNumbers());
		System.out.println(emp1.getNumbers());
		System.out.println(emp1.getNumbers());
		System.out.println(emp1.getNumbers());
	}
}