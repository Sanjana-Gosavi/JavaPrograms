class parameterizedConst
{
	int roll;
	String name;
	public parameterizedConst(int rn, String nm)
	{
		this.roll=rn;
		this.name=nm;
	}


	public static void main(String args[])
	{
		parameterizedConst p=new parameterizedConst(1,"Ram");
		
		System.out.println(p.roll);
		System.out.println(p.name);
	}
}