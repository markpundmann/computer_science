public class AlterSum
{
	public AlterSum()
	{
		a=0;
		b=0;
		boolean flag=true;
		boolean flag2=true;
	}
	public AlterSum(int[] x)
	{
		classArray=x;
		int d=classArray.length;
	}
		public int getValue();
		{
			if(flag)
			{
				b=classArray(0);
			}
					else
					{
						while(a<d)
						{
							if(flag2)
							{
								boolean flag2=false;
								d+=classArray[a];
							}
							else
							{
								boolean flag2=true;
								d-=classArray[a];
							}
							a++;
						}
			}
			return b;
	}



	private boolean flag2;
	private int d;
	private boolean flag;
	private int b;
	private int a;
	private int[] classArray;
}