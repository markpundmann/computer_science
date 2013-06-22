// Mark Pundmann
public class Geometry
{
	/**
	Finds the volume of a sphere
	@param r the radius of the circle
	(Precondition: r > 0)	(Postcondition: The return value equals the Volume of the sphere.)
	*/
	public static double sphereVolume(double r)
	{
		return (4.0/3*Math.PI*r*r*r);
	}

	/**
	Finds the surface of a sphere
	@param r the radius of the circle
	(Precondition: r > 0)	(Postcondition: The return value equals the surface area of the sphere.)
	*/
	public static double sphereSurface(double r)
	{
		return (4*Math.PI*r*r);
	}

	/**
	Finds the volume of a cylinder
	@param r the radius of the circle, h is the height of the cylinder
	(Precondition: r > 0, h>0)	(Postcondition: The return value equals the Volume of the cylinder.)
	*/
	public static double cylinderVolume(double r, double h)
	{
		return (Math.PI*r*r*h);
	}

	/**
	Finds the surface area of a cylinder
	@param r the radius of the circle, h is the hieght
	(Precondition: r > 0, h > 0)	(Postcondition: The return value equals the surface area of the cylinder.)
	*/
	public static double cylinderSurface(double r, double h)
	{
		return (2*Math.PI*r*r+(2*Math.PI*r*h));
	}

	/**
	Finds the volume of a cone
	@param r the radius of the circle, h is the hieght
	(Precondition: r > 0, h > 0)	(Postcondition: The return value equals the Volume of the cone.)
	*/
	public static double coneVolume(double r, double h)
	{
		return (1.0/3*Math.PI*r*r*h);
	}

	/**
	Finds the surface of a cone
	@param r the radius of the circle, h is the hieght
	(Precondition: r > 0, h > 0)	(Postcondition: The return value equals the surface area of the cone.)
	*/
	public static double coneSurface(double r, double h)
	{
		return (Math.PI*r*r+Math.sqrt(h*h+r*r)*r*Math.PI);
	}
}