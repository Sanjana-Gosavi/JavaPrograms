class triangleArea
{	
	static int base;
	static int height;
	static int area;
	
	public triangleArea(int base, int height)
	{
		this.base=base;
		this.height=height;
	}
	public static void main(String args[])
	{
		triangleArea t= new triangleArea(4,6);
		area=(base*height)/2;
		System.out.println("Area of triangle is:" +area);
	}
}