public class LottoTester
{
	public static void main(String[] args)
	{
		Lotto n1=new Lotto(1, 52);

		for(int i=0; i<6; i++)
		{
			int number=n1.produceNumber();
			System.out.println(number+" ");
		}
	}
}
