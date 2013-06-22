import java.awt.Rectangle;

public class SandwichTester
{
	public static void main(String[] args)
	{

		Sandwich sub=new Sandwich();

		Edible e=sub;

		//System.out.println(e.isEdible());  prints true

		Rectangle cerealBox=new Rectangle(5, 10, 20, 30);

		//Edible f=cerealBox;  incompatible types

		//Edible f=(Edible)cerealBox;
		//System.out.println(f.isEdible());  run time error (does not have method isEdible)

		//sub=e;  incompatible types (not all edible foods are sandwiches)

		sub=(Sandwich)e;

		System.out.println(sub.isEdible());

		//sub=(Sandwich)cerealBox;  incompatible types

		/*	CONCLUSIONS:
		interfaces work about the same way as superclassess
		You can convert lower classes into higher class but not vice versa
		unless the class was originally the  smaller one (once it has been
		changed to the higher up class and back down, it will not have all
		of the attributes of the smaller class)

		interface must be implemented in order to use (must contain method from interface)

		cannot create an instance of an interface

		cannot assign an interface type to a class because an interface can be implemented
		by multiple classes
		*/
















	}
}