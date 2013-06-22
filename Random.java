import java.util.Random;
public class RandomNumber
{
	public RandomNumber(int a, int s)
	{
		b=a;
		size=s;
		generator=new Random();
	}
	public int produceNumber()
	{
		return b + generator.nextInt(size);
	}

Random generator;
public int size;
public int b;
}