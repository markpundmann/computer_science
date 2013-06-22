// methods called (nextFactor) and (hasMoreFactors)
public class FactorGenerator
{
	public FactorGenerator()
		{
			a=0;
		}
		public FactorGenerator(int x1)
		{
			a=x1;
		}
		public int nextFactor()
		{
			while((a%2)==0);
			{
				a/=2;
				return 2;
			}

		}



	private int a;
}
