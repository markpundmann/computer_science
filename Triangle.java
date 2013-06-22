public class Triangle
{
	public Triangle()
	{
		a=0;
		b=0;
		c=0;
		d=0;
		e=0;
		f=0;
	}
	public Triangle(double a, double b, double c, double d, double e, double f)
	{
		a=x1;
		b=x2;
		c=x3;
		d=y1;
		e=y2;
		f=y3;
	}

		public void calcLength(double x1, double x2, double x3, double y1, double y2, double y3)
		{
			side1=Math.hypot((x1-x2),(y1-y2));
			side2=Math.hypot((x1-x3),(y1-y3));
			side3=Math.hypot((x2-x3),(y2-y3));
			p=(side1+side2+side3)/2;
		}

		public String toString()
		{
			return "Side one = "+side1+"\nSide two = "+side2+"\nSide three = "+side3;
		}

		public double getPerim()
		{
			return side1+side2+side3;
		}

		public double getArea()
		{
			return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		}

		public void calcAngles();
		{

		}




	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	private double p;
	private double x1;
	private double x2;
	private double x3;
	private double y1;
	private double y2;
	private double y3;
	private double x;
	private double y;
	private double side1;
	private double side2;
	private double side3;

}