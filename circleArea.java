class circleArea
{
	static int radius;
	double area;
	static double PI=3.14;

	public circleArea(int radius)
	{
		this.radius=radius;
	}
	public static void main(String args[])
	{
		circleArea c= new circleArea(5);
		double area=PI*radius*radius;
		System.out.println("Area of circle is:" +area);
	}
}