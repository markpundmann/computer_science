// Mark Pundmann
public class DigitExtractor
{
	public DigitExtractor()
	{
		a=0;
	}
	public DigitExtractor(int b)
	{
		a = b;
		c = 1;
	}

	public int getNumbers()
	{
		c *= 10;
		return (a%c)/(c/10);
	}





	private int c;
	private int a;
}