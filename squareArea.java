class squareArea
{
	static int side;
	static int area;
	public squareArea(int side)
	{
		this.side=side;
	}
	public static void main(String args[])
	{	
		squareArea s= new squareArea(8);
		area=side*side;
		System.out.println("Area of square is:" +area);	
	}
}