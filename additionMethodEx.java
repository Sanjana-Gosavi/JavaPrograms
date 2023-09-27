class addition
{
	public int addition(int a, int b)
	{
		int sum=a+b;
		return sum;
		
	}
}
class additionMethodEx
{
	public static void main(String args[])
	{
		addition add=new addition();
		int a=add.addition(23,33);
		System.out.println("Addition of two numbers is:"+a);
	}
}
	