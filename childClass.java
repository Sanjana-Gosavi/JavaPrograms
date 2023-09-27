class childClass extends superClass
{
	childClass()
	{
		System.out.println("Child class constructor!!!");
	}	
	
	public static void print()
	{
		System.out.println("Child class static method!!!");
	}
	
	{
		System.out.println("Child class instance block!!!");
	}
	
	static 
	{
		System.out.println("Child class static block!!!");
	}
	
	public void print1()
	{		
		System.out.println("Child Class instance method!!!");
	}
	
	public static void main(String args[])
	{
		childClass c=new childClass();
		c.print1();
		print();
	}
}
	