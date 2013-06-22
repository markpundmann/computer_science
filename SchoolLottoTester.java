import javax.swing.JOptionPane;
public class SchoolLotteryTester
{
	public static void main(String[] args)
	{
		String x11=JOptionPane.showInputDialog("Please input the amount of Lottery Tickets Sold");
		int x1 = Integer.parseInt(x11);
		
		SchoolLottery emp1=new SchoolLottery(x1);
		emp1.calcWinners();
		System.out.println(emp1.toString());
		
		
		
		
		
		
		
		
		
		
	}
}
