import java.awt.Rectangle;

public class Chapter5notes
{
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="hello";
		String s3="Hello";

		if(s1.equals(s3))
			System.out.println("String 1 is equal to String 3");
		else
			System.out.println("String 1 isnt equal to String 3");

		if(s2.equals(s3))
			System.out.println("String 2 is equal to String 3");
		else
			System.out.println("String 2 isnt equal to String 3");

		if(s2.equalsIgnoreCase(s3))
			System.out.println("String 2 is equal to String 3");
		else
			System.out.println("String 2 isnt equal to String 3");

		if(s1==s3)
			System.out.println("s1==s3");

//=0 than they are the same, negative-s2 is less than s2, positive-s1 is greater than s2(#'s, Caps, Lower Case)
		if(s2.compareTo(s3)>0)
			System.out.println("String 2 is equal to String 3");
		else
			System.out.println("String 2 isnt equal to String 3");

		Rectangle r1=new Rectangle(1, 2, 3, 4);
		Rectangle r2=r1;// same memory location as r1(they point to same memory adress)
		Rectangle r3=new Rectangle(1, 2, 3, 4);// r1=r2 when compared but r3 doesnt = r1 or r2


		if(r1==r3)
			System.out.println("r1==r3");
		else
			System.out.println("r1 is not = to r3");

		if(r1==r2)
			System.out.println("r1==r2");

			if(r1.equals(r2))
				System.out.println("r1 equals r2");





	}
}