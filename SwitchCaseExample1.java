class SwitchCaseExample1
{
	public static void main(String args[])
	{
		int size = 42;
		
		System.out.println("Switch case Demo!!");
		
		switch(size)
		{
			case 28:
			System.out.println("Small");
			break;
			
			case 32:
			System.out.println("Medium");
			break;
			
			case 40:
			System.out.println("Large");
			break;
			
			case 42:
			System.out.println("Extra Large");
			break;
			
			default:
			System.out.println("Size is out of stock!!!");
		}
	}
}