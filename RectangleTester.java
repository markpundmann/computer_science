import java.awt.Rectangle;

public class RectangleTester
{

	public static void main(String[]args)
	{

		Rectangle box = new Rectangle(10,10,20,30);
		System.out.println("The height is "+box.getHeight());


		box.setBounds(20,30,50,10);
		System.out.println("The height is "+box.getHeight());
		System.out.println("The X coordinate is "+box.getX());
		System.out.println("The Y coordinate is "+box.getY());




	}
}
