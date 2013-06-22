public class LoopsTester
{
	public static void main(String[] args)
	{
		//while loop
		int x=0;
		while(x<10)
		{
			x++;
			System.out.println(x);
		}


		System.out.println();

		boolean flag=true;

		while(flag)
		{
			System.out.println("TRUE");
			flag=false;
		}

		//for loop

		for(int y=6; y<13; y+=2)
			System.out.println(y);

			System.out.println();

			int a=9;
		for(int b=25; b<65; b+=a)
		{
			a=a+2;
			System.out.println(b);
		}


		System.out.println();

		for(int i=1; i<4; i++)
			for(int j=1; j<3; j++)
				System.out.println(j);


		System.out.println();

		for(int rows=1; rows<5; rows++)
			{
				for(int col=1;col<=rows; col++)
				{
					System.out.print(rows);
				}
			System.out.println();
			}






	}
}
