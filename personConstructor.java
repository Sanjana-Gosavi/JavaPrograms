class personConstructor
{
	String name;
	float weight;
	int height;
	
	public personConstructor(String name, float weight, int height)
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
	}
	public static void main(String args[])
	{
		personConstructor p= new personConstructor("ABC",54.2f,150);
		System.out.println("Name is:"+p.name);
		System.out.println(p.name+" weight is:"+p.weight);
		System.out.println(p.name+" height is:"+p.height);
	}
}