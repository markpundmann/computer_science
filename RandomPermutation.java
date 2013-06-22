import java.util.ArrayList;
import java.util.Random;
public class RandomPermutation
{
	public RandomPermutation()
	{
		number=0;
		generator=new Random();
		int[] classArray=new int[10];
		int c=0;
		ArrayList<Integer> randoms=new ArrayList<Integer>();
		for(int d=1; d<=10;d++)
				randoms.add(new Integer(d));
	}
	public RandomPermutation(int n)
	{
		number=n;
	}

	public void calcArray()
	{
		for(int d=0;d<9;d++)
		{
			b=generator.nextInt(1)-1;
			 classArray[c]=b;
			 randoms.remove(b);
			 c++;
	 	}
	}
	public int[] getRandoms()
	{
		return classArray;
	}


Random generator;
	private int number;
	private int a;
	private int b;
	private int c;
	private int[] classArray;
}