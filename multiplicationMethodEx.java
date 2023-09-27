class multiplication
{
	public int multiplication(int a, int b)
	{	
		int multi=a*b;
		return multi;
	}
}	
class multiplicationMethodEx
{
	public static void main(String args[])
	{
		multiplication m=new multiplication();
		int m1=m.multiplication(4,6);
		System.out.println("Multiplication of two numbers is:"+m1);
	}
}