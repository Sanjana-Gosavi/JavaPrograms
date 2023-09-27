public class student extends person
{
	int roll;
	String name;
	
	public student()
	{
		//super(10, 10, 10);
		//this.roll=40;
		//this.name="AAAA";
	}
	
	public student(int rn, String nm)
	{
		this(rn,nm,6,67,30);
		this.roll = rn;
		this.name =nm;
		
		
	}

	public student(int roll, String name, int height, int weight, int age)
	{
		
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.roll = roll;
	}
	
	
}
	