public class StringSorter
{
	public StringSorter()
	{
		x1="";
		x2="";
		x3="";
		x4="";
	}
	public StringSorter(String a, String b, String c, String d)
	{
		x1=a;
		x2=b;
		x3=c;
		x4=d;
	}

	public String getLargest()
	{
		if(x1.compareTo(x2)>0 && x1.compareTo(x3)>0 && x1.compareTo(x4)>0)
			return x1;
		else if(x2.compareTo(x1)>0 && x2.compareTo(x3)>0 && x2.compareTo(x4)>0)
			return x2;
		else if(x3.compareTo(x1)>0 && x3.compareTo(x2)>0 && x3.compareTo(x4)>0)
			return x3;
		else
			return x4;
	}

	public String getSmallest()
	{
		if(x1.compareTo(x2)<0 && x1.compareTo(x3)<0 && x1.compareTo(x4)<0)
			return x1;
		else if(x2.compareTo(x1)<0 && x2.compareTo(x3)<0 && x2.compareTo(x4)<0)
			return x2;
		else if(x3.compareTo(x1)<0 && x3.compareTo(x2)<0 && x3.compareTo(x4)<0)
			return x3;
		else
			return x4;
	}




private String x1;
private String x2;
private String x3;
private String x4;
}
