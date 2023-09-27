class division
{
	public float division(int a,int b)
	{
		float div=a/b;
		return div;
	}
}
class divisionMethodEx
{
	public static void main(String args[])
	{
		division d= new division();
		float d1=d.division(55,3);
		System.out.println("Division of two numbers is:"+d1);
	}
}