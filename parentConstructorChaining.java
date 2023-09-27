public class parentConstructorChaining
{
	public parentConstructorChaining()
	{
		this(20,30);
		System.out.println("Parent class default constructor!!");
	}
	public parentConstructorChaining(int a, int b)
	{
		System.out.println("Parent class parameterized constructor!!");
	}
	
}	