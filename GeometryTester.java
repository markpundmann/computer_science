import javax.swing.JOptionPane;
public class GeometryTester
{
	public static void main (String[] args)
	{
		double x1=0;
		double x2=0;
		do
		{
		String x11=JOptionPane.showInputDialog("Please input the radius 1");
		x1=Double.parseDouble(x11);
		}while(x1<=0);

		do
		{
			String x12=JOptionPane.showInputDialog("Please input the hieght");
			x2=Double.parseDouble(x12);
		}while(x2<=0);

		System.out.println("The Sphere volume is "+Geometry.sphereVolume(x1));
		System.out.println("The Sphere surface is "+Geometry.sphereSurface(x1));
		System.out.println("The Cylinder volume is "+Geometry.cylinderVolume(x1, x2));
		System.out.println("The Cylinder surface is "+Geometry.cylinderSurface(x1, x2));
		System.out.println("The Cone volume is "+Geometry.coneVolume(x1, x2));
		System.out.println("The Cone surface is "+Geometry.coneSurface(x1, x2));





n






	}
}