public class childConsChain extends parentConsChain
{
	int height;
	
	public childConsChain()
	{
		super(28, "Sanjana");
		this.height=height;
	}
	
	public childConsChain(int height)
	{
		this(height, 28, "Sanjana");
		this.height=height;
	}

	public childConsChain(int height, int age, String name)
	{
		this.height=height;
		this.age=age;
		this.name=name;
	}


	/*derived class default constructor  
	childConsChain()  
	{  
		this("Java", "Python");  
		System.out.println("Derived class default constructor called");  
	}  
	//derived class parameterized constructor  
	childConsChain(String str1, String str2)  
	{  
		super();  
		System.out.println("Derived class parameterized constructor called");  
	}  */
}