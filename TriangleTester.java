import javax.swing.JOptionPane;
public class TriangleTester
{
	public static void main(String[] args)
	{

		String x11=JOptionPane.showInputDialog("Please input x value 1");

		double x1=Double.parseDouble(x11);

		String y11=JOptionPane.showInputDialog("Please input y value 1");

		double y1=Double.parseDouble(y11);

		String x22=JOptionPane.showInputDialog("Please input x value 2");

		double x2=Double.parseDouble(x22);

		String y22=JOptionPane.showInputDialog("Please input y value 2");

		double y2=Double.parseDouble(y22);

		String x33=JOptionPane.showInputDialog("Please input x value 3");

		double x3=Double.parseDouble(x33);

		String y33=JOptionPane.showInputDialog("Please input y value 3");

		double y3=Double.parseDouble(y33);

		Triangle emp1=new Triangle(x1, x2, x3, y1, y2, y3);

		emp1.calcLength(x1, x2, x3, y1, y2, y3);

		System.out.println(emp1.toString());

		System.out.println("Perimeter = "+emp1.getPerim());

		System.out.println("Area = "+emp1.getArea());

	}

}