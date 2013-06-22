import javax.swing.JOptionPane;

public class SquareTester
{
		public static void main(String[] args)
		{
			double side;
			side=4.1;
			double perimeter;
			double area;

			perimeter = 4*side;
			area = side*side;


			System.out.println("The length of the side of the square is "+side) ;
			System.out.println("The perimeter of the square is "+perimeter);
			System.out.println("The Area of the square is "+area);
			System.out.println("Area = "+side*side);


			String sside=JOptionPane.showInputDialogue(
			"Enter the length of the side of the square. ");

			double dSide=doubleParse.Double(sSide);

			System.out.println("The area is "+dSide*dSide);





		}
}