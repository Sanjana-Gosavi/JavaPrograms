class rectangleArea
{
	static double length;
	static float width;
	double area;
	public rectangleArea(double length,float width)	
	{
		this.length=length;
		this.width=width;	
	}
	public static void main(String args[])
	{
		rectangleArea r= new rectangleArea(5.5,4);
		double area=length*width;
		System.out.println("Area of rectangle is:" +area);
	}
}