import java.util.Random;

public class ArrayTester
{
	public static void main(String[] args)
	{
		/*
		int[] numbers=new int[4];

		for(int a=0; a<numbers.length; a++)
			System.out.println(numbers[a]);

		System.out.println("\n"+numbers+"\n");

		numbers[0]=99;
		numbers[2]=25;

		for(int a=0; a<numbers.length; a++)
			System.out.println(numbers[a]);



		String[] names={"Joe","Mary","Jane","Andy"};

		System.out.println();

		for(int a=0; a<numbers.length; a++)
			System.out.println(names[a]);
		*/


		int[] values={2,4,15,26,33,45};

		Random generator=new Random();
		int roll= 1+generator.nextInt(52);
		System.out.println(roll);

		boolean flag=false;
		for(int a=0; a<6; a++)
		{
			if(values[a]==roll)
				flag=true;
		}
		if(flag)
			System.out.println("You Win");
		else
			System.out.println("No Match");

	}
}