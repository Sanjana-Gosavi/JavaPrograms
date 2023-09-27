class noArgsConst
{	
	int id;
	String empName;
	String desn;
	
	public noArgsConst()
	{
		
	}
	public static void main(String args[])
	{
		noArgsConst n= new noArgsConst();
		n.id=1;
		n.empName="Ram";
		n.desn="Manager";
	
		System.out.println(n.id);
		System.out.println(n.empName);
		System.out.println(n.desn);
	}
}