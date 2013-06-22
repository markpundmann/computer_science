public class SelectionSorter
{
		public SelectionSorter(int[] a)
		{
			values=a;
		}
		public void sort()
		{
			for(int c=0; c<values.length; c++)
			{
				int minPos=findMinPos(c);
				swap(c, minPos);
			}
		}

		public void swap(int x, int y)
		{
			temp=values[y];
			values[y]=values[x];
			values[x]=temp;
		}

		public int findMinPos(int c)
		{
			int value1=c;
			for(int d=c+1; d<values.length; d++)
				if(values[value1]>values[d])
				{
					value1=d;
				}

			return value1;
		}



		public int[] returnArray()
		{
			return values;
		}


private int temp;
private int[] values;
private int b;
private int min;
private int c;
private int d;
}