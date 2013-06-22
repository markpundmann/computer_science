public class FactorExtractor
{
	public FactorExtractor()
	{
		a=0;
	}
	public FactorExtractor(int x1)
	{
		a=x1;
	}
	public void newNumbers()
	{
		int d=2;
	}
	public int nextFactor()
	{
		if(a%d==0)
		{
			return d;
		}
		else
			d++;
	}
	public boolean hasMoreFactors()
		{
			if(a==1)
			{
				return false;
			}
			else
			{
				return true;
			}
		}




	private int d;
	private int a;
}
