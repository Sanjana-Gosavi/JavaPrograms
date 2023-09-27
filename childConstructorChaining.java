public class childConstructorChaining extends parentConstructorChaining
{
	childConstructorChaining()
	{
		this("Hiiii!!!", "Hello!!!");
		System.out.println("child class default constructor!!");
	}
	childConstructorChaining(String s1, String s2)
	{
		super();
		System.out.println("child class parameterized constructor!!");
	}
}