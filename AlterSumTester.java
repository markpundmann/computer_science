import javax.swing.JOptionPane;
public class AlterSumTester
{
	public static void main(String[] args)
	{

		String x11=JOptionPane.showInputDialog("Please input the amount of #'s you would like to enter");
		int a = Integer.parseInt(x11);

		int[] numbers=new int[a];

		for(int b=0; b<a; b++)
		{
			int d=1;
			String x12=JOptionPane.showInputDialog("Please input your "+d+" number you would like to enter");
			int c = Integer.parseInt(x12);
			numbers[b]=c;
			d++;
		}

		AlterSum x1=new AlterSum(numbers);
		System.out.println(emp1.getValue());
/*
int x=5;
int[] numbers=new int[x];
ClassX x1=new ClassX(numbers);



CLASS FILE

public ClassX(int[] x)
{
	classArray=x;
}

private int[] classArray;


*/
	}
}