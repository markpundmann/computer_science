import java.util.Random;
public class SchoolLottery
{
	public SchoolLottery(int a)
	{
		NumberofTickets=a;
		generator=new Random();
		int[] WinningNumbers=new int[6];
		boolean WinningColer;
		boolean Coler;
		int GrandPrize=0;
		int SecondPrize=0;
		int ThirdPrize=0;
		int FourthPrize=0;
	}
	public void calcNumbers()
	{
		int[] LotteryNumbers=new int[6];
		for(int a=0; a<=5; a++)
		{
			do
			{
				b=generator.nextInt(52);
			}while((b==LotteryNumbers[0] || b==LotteryNumbers[1] || b==LotteryNumbers[2] || b==LotteryNumbers[3] || b==LotteryNumbers[4] || b==LotteryNumbers[5]));
			LotteryNumbers[a]=b;
		}
		 Coler=generator.nextBoolean();
	}
	public void calcWinners()
	{
		calcNumbers();
		System.arraycopy(LotteryNumbers, 0, WinningNumbers, 0, 6);
		WinningColer=Coler;
		
		for(int b=0; b<NumberofTickets; b++)
		{
			int NumberofMatches=0;
			calcNumbers();
			for(int c=0; c<5; c++)
			{
				for(int d=0;d<=5; d++)
				{
					if(LotteryNumbers[c]==WinningNumbers[d])
						NumberofMatches++;
				}
			}
			if(NumberofMatches>=4)
			{
				if(NumberofMatches==4)
					FourthPrize++;
				else if(NumberofMatches==5)
					ThirdPrize++;
				else if(NumberofMatches==6 && Coler!=WinningColer)
					SecondPrize++;
				else
					GrandPrize++;
			}
		}
	}
	public String toString()
	{
		return ""+WinningNumbers+WinningColer+GrandPrize+SecondPrize+ThirdPrize+FourthPrize;
	}

Random generator;
	public int b;
	private int NumberofTickets;
	private int[] LotteryNumbers;
	private int[] WinningNumbers;
	private boolean WinningColer;
	private boolean Coler;
	private int GrandPrize;
	private int SecondPrize;
	private int ThirdPrize;
	private int FourthPrize;
}