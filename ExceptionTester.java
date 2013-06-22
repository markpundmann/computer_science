import java.util.Scanner;
import java.io.*;

public class ExceptionTester
{
	public static void main(String[] args) throws BadDataException
	{

		try
		{
			System.out.println(5/0);
		}

		catch(ArithmeticException exception)
		{
			System.out.println("Arithmetic Exception \n");
		}

		int[] numbers=new int[4];

		try
		{
			System.out.println(numbers[4]);
		}

		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("ArrayIndexOutOfBoundsException \n");
		}

		try
		{
			String s="abcd";
			int x=Integer.parseInt(s);
		}

		catch(NumberFormatException exception)
		{
			System.out.println("Number Format Exception \n");
		}

		int[] names=null;

		try
		{
			System.out.println(names.length);
		}

		catch(NullPointerException exception)
		{
			System.out.println("Null Pointer Exception \n");
		}

		try
		{
			Scanner abc=new Scanner(new File("dne.txt"));
		}

		catch(FileNotFoundException exception)
		{
			System.out.println("File Not Found \n");
		}


		double amount=10;
		double balance=100;

		if(amount<balance)
		{
			throw new IllegalArgumentException("ERROR!! Amount is less than the balance");
		}



		int number=-1;
		if(number<0)
			throw new BadDataException("YOU CAN NOT DO THAT\n");









	}
}