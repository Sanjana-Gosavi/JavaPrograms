class comboConstructor
{
	int id;
	String name;
	long mobNo;
	
	public comboConstructor()
	{
	//no args
	}
	public comboConstructor(int id)
	{
		this.id=id;
	}
	public comboConstructor(long mobNo,String name)
	{
		this.mobNo=mobNo;
		this.name=name;
	}
	public comboConstructor(int id,String name, long mobNo)
	{
		this.id=id;
		this.name=name;
		this.mobNo=mobNo;
	}
	public static void main(String args[])
	{
		comboConstructor c1= new comboConstructor();
		c1.id=1;
		c1.name="AAA";
		c1.mobNo=987654;
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c1.mobNo);

		comboConstructor c2=new comboConstructor(2);
		System.out.println(c2.id);

		comboConstructor c3= new comboConstructor(908,"BBB");
		System.out.println(c3.mobNo);
		System.out.println(c3.name);

		comboConstructor c4= new comboConstructor(3,"CCC",9878);
		System.out.println(c4.id);
		System.out.println(c4.name);
		System.out.println(c4.mobNo);
	}
}